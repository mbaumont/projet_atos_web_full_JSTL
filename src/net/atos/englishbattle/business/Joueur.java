package net.atos.englishbattle.business;

import java.util.List;

public class Joueur {
	
	// Ajout des attributs privés
	private Long id;
	private String pseudo;
	private String email;
	private String motDePasse;
	private Niveau niveau;
	private List<Partie> parties;
	private static Long compteur = 0L;
	
	// Génération des constructeurs
	
	public Joueur() {
		super();
		id = ++compteur;
		
	}

	public Joueur(String pseudo, String email, String motDePasse, Niveau niveau) {
		this();
		this.pseudo = pseudo;
		this.email = email;
		this.motDePasse = motDePasse;
		this.niveau = niveau;
	}
	 // G�n�ration des getters et setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	public static long getCompteur() {
		return compteur;
	}

	public static void setCompteur(long compteur) {
		Joueur.compteur = compteur;
	}

	
	// Génération de la méthode toString()
	

	public List<Partie> getParties() {
		return parties;
	}

	public void setParties(List<Partie> parties) {
		this.parties = parties;
	}
	
	public Long getTempsMoyenDeReponseEnMillisecondes() {
		if (parties.size()==0) return null;
		
		long tempsMoyenDeReponseEnMillisecondes = 0;
		for (Partie partie : parties) {
			tempsMoyenDeReponseEnMillisecondes += partie.getTempsMoyenDeReponseEnMillisecondes();
		}
		return tempsMoyenDeReponseEnMillisecondes/parties.size();
	}
	
	@Override
	public String toString() {
		return "Joueur [id=" + id + ", pseudo=" + pseudo + ", email=" + email + ", motDePasse=" + motDePasse
				+ ", niveau=" + niveau + "]";
	}
	
}
