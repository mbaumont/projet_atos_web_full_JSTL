package projet_atos_web.app;
/**
 * 
 * @author Administrateur
 * Une classe de type "Bean" poss�de que des donn�es priv�s 
 * avec des getter et des setter
 * et aussi un constructeur sans param�tre
 */
public class Personne {
	private String nom;
	private String prenom;
	/**
	 * Constructeur Personne sans param�tre avec initialisation des donn�es
	 * priv�es 
	 */
	public Personne() {
		// TODO Auto-generated constructor stub
		this.nom = "Nom par d�faut";
		this.prenom = "Pr�nom par d�faut";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
