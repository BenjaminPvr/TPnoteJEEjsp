package beans;

import java.util.Date;

import javax.persistence.Column;

import org.hibernate.annotations.Type;

public class EmployeBean {
	private long idEmployee;
	private String nom;
	private String prenom;
	private String login;
	private String motDePasse;
	private Date dateNaissance;
	private String adresse;
	@Column(name = "pleinTemps", nullable = false)
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean pleinTemps;
	
	
	public long getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(long idEmployee) {
		this.idEmployee = idEmployee;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public boolean isPleinTemps() {
		return pleinTemps;
	}
	public void setPleinTemps(boolean pleinTemps) {
		this.pleinTemps = pleinTemps;
	}

}
