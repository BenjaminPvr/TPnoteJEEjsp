package application.beans;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Employe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idEmployee;
	private String nom;
	private String prenom;
	private String login;
	private String motDePasse;
	private Date dateNaissance;
	private String adresse;
	private boolean pleinTemps;
	@OneToMany(mappedBy="Employe")
	private Set<Offre> offresCrees;
	
	public Employe() {
		offresCrees = new HashSet<>(0);
	}
	
	public Employe(String nom, String prenom, String login, String motDePasse, Date dateNaissance,
			String adresse, boolean pleinTemps) {
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motDePasse = motDePasse;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.pleinTemps = pleinTemps;
	}
	
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
	public Set<Offre> getOffresCrees() {
		return offresCrees;
	}
	public void setOffresCrees(Set<Offre> offresCrees) {
		this.offresCrees = offresCrees;
	}
	
}
