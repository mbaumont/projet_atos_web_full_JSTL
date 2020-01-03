package projet_atos_web.app;

import java.io.Serializable;

public class userExo3 implements Serializable{
	private String Prenom;
	private String Nom;
	private String PassWord;
	private String NomU;
	public userExo3(
			String NomU, String PassWord, String Nom, String Prenom) {
		this.NomU = NomU;
		this.Nom = Nom;
		this.Prenom = Prenom;
		this.PassWord = PassWord;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public String getNomU() {
		return NomU;
	}
	public void setNomU(String nomU) {
		NomU = nomU;
	}
}
