package application.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Offre {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idOffre;
	private String descriptionOffre;
	private int nbPlacesTotales;
	private int nbPlacesRestantes;
	@ManyToOne
	private Employe employe;
	@ManyToOne
	private Lieu lieu;
	@OneToMany(mappedBy="offre", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<ClasseAge> prixParClasseAge;
	
	public Offre() {
		prixParClasseAge = new HashSet<>(0);
	}
	
	public Offre(String descriptionOffre, int nbPlacesTotales, int nbPlacesRestantes,
			Employe employe, Lieu lieu) {
		this();
		this.descriptionOffre = descriptionOffre;
		this.nbPlacesTotales = nbPlacesTotales;
		this.nbPlacesRestantes = nbPlacesRestantes;
		this.employe = employe;
		this.lieu = lieu;
	}

	public long getIdOffre() {
		return idOffre;
	}
	public void setIdOffre(long idOffre) {
		this.idOffre = idOffre;
	}
	public String getDescriptionOffre() {
		return descriptionOffre;
	}
	public void setDescriptionOffre(String descriptionOffre) {
		this.descriptionOffre = descriptionOffre;
	}
	public int getNbPlacesTotales() {
		return nbPlacesTotales;
	}
	public void setNbPlacesTotales(int nbPlacesTotales) {
		this.nbPlacesTotales = nbPlacesTotales;
	}
	public int getNbPlacesRestantes() {
		return nbPlacesRestantes;
	}
	public void setNbPlacesRestantes(int nbPlacesRestantes) {
		this.nbPlacesRestantes = nbPlacesRestantes;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public Lieu getLieu() {
		return lieu;
	}
	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}
	public Set<ClasseAge> getPrixParClasseAge() {
		return prixParClasseAge;
	}
	public void setPrixParClasseAge(Set<ClasseAge> prixParClasseAge) {
		this.prixParClasseAge = prixParClasseAge;
	}

}
