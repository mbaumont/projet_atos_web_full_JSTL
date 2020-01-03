package net.atos.englishbattle;

import java.util.Scanner;

import net.atos.englishbattle.business.Joueur;
import net.atos.englishbattle.business.Niveau;
import net.atos.englishbattle.business.Partie;
import net.atos.englishbattle.business.Question;
import net.atos.englishbattle.business.Verbe;
import net.atos.englishbattle.exceptions.AucunVerbeException;
import net.atos.englishbattle.service.JoueurService;
import net.atos.englishbattle.service.NiveauService;
import net.atos.englishbattle.service.PartieService;
import net.atos.englishbattle.service.QuestionService;
import net.atos.englishbattle.service.VerbeService;
import net.atos.englishbattle.service.impl.JoueurServiceImpl;
import net.atos.englishbattle.service.impl.NiveauServiceImpl;
import net.atos.englishbattle.service.impl.PartieServiceImpl;
import net.atos.englishbattle.service.impl.QuestionServiceImpl;
import net.atos.englishbattle.service.impl.VerbeServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	
	// On se limite aux m�thodes d�clar�es dans l'interface
	private static VerbeService verbeService = new VerbeServiceImpl();
	private static NiveauService niveauService = new NiveauServiceImpl();
	private static JoueurService joueurService = new JoueurServiceImpl();
	private static PartieService partieService = new PartieServiceImpl();
	private static QuestionService questionService = new QuestionServiceImpl();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Etape 1: On importe les verbes disponibles en ligne dans un fichier CSV
		if (verbeService.recupererVerbes().isEmpty()) {
			try {
				verbeService.importerVerbes();
			} catch (AucunVerbeException e) {
				System.out.println();
				e.printStackTrace();
			}
		}
		
		// Etape 2: On ajoute les niveaux (d�butant, interm�diaire, expert)
		if (niveauService.recupererNiveaux().isEmpty()) {
			niveauService.ajouterNiveaux();
		}
		
		
		// Etape 3: On demande au joueur de renseigner son pseudo, son mot de passe
		System.out.println("Veuillez donner votre pseudo: ");
		String pseudo = scanner.nextLine();
		System.out.println("Veuillez donner votre mot de passe: ");
		String motDePasse = scanner.nextLine();
		
		// Etape 4:  On demande au joueur de renseigner son pseudo, son mot de passe puis de choisir son niveau
		afficherNiveaux();
		System.out.println("Pr�cisez l�id de votre niveau: ");
		Long idNiveauChoisi = Long.parseLong(scanner.nextLine());
		
		// Etape 5: On ajoute le joueur avec le pseudo, le mot de passe et le niveau choisi
		Joueur joueur = joueurService.ajouterJoueur(idNiveauChoisi, pseudo, motDePasse);
		
		// Etape 6: On demande � PartieService d'ajouter une partie pour ce joueur
		Partie partie = partieService.ajouterPartie(joueur);
		
		// Game on ! Le jeu peut d�buter, "c'est ma derni�re r�ponse Jean-Pierre"
		boolean leJoueurADonneLesBonnesReponses = true;
		do {
			Question question = questionService.ajouterQuestionAPartie(partie);
			if (question==null) {
				break;
			}
			Verbe verbeDemande = question.getVerbe();
			System.out.print(partie.getQuestions().size() + ". Donnez le pr�t�rit et le participe pass� du verbe " + verbeDemande.getBaseVerbale() + " ");
			// Si le joueur est d�butant, on affiche la traduction
			if (joueur.getNiveau().getNom().equals(Niveau.DEBUTANT)) {				
				System.out.print( "(" + verbeDemande.getTraduction() + ") ");
			}
			
			// Si le joueur est d�butant ou interm�diare, on affiche soit le pr�t�rit soit le participe pass�
			if (question.getAffichePreterit()!=null && question.getAffichePreterit()) {
				System.out.print("- indice pr�t�rit: " + question.getVerbe().getPreterit());	
			}
			else if (question.getAffichePreterit()!=null && !question.getAffichePreterit()) {
				System.out.print("- indice participe pass�: " + question.getVerbe().getParticipePasse());	
			}

			System.out.println("");
			
			String saisie = scanner.nextLine();
			String[] reponses = saisie.split(",");
			if (reponses.length==2)
			{
				question.setReponsePreterit(reponses[0].trim());
				question.setReponseParticipePasse(reponses[1].trim());
			}
			leJoueurADonneLesBonnesReponses = questionService.verifierReponses(question);
			// On affiche le temps de r�ponse
			System.out.println("Vous avez r�pondu en " + question.getTempsDeReponseEnMillisecondes()/1000 + " secondes");
		} while (leJoueurADonneLesBonnesReponses);
		
		if (leJoueurADonneLesBonnesReponses) 
		{
			System.out.println("Bravo ! Vous avez r�pondu � toutes les questions.");
		}
		else
		{
			System.out.println("R�ponse incorrecte ou temps d�pass�.");
		}
		System.out.println("Votre temps de r�ponse moyen pour cette partie: " + partie.getTempsMoyenDeReponseEnMillisecondes()/1000 + " secondes");
		System.out.println("Au revoir");
	}
	
	private static void afficherNiveaux() {
		for (Niveau niveau : niveauService.recupererNiveaux()) {
			System.out.println(niveau.getId() + "." + niveau.getNom());
		}
	}
}
