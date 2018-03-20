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
public class ClasseAge {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idClasseAge;
	private int ageMin;
	private int ageMax;
	private double prix;
	@ManyToOne
	private Offre offre;
	@OneToMany(mappedBy="clePrimaire.reservation", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<ReservePlaces> classesAge;
	
	

	public ClasseAge() {
		classesAge = new HashSet<>(0);
	}
	
	public ClasseAge(int ageMin, int ageMax, double prix, Offre offre) {
		this();
		this.ageMin = ageMin;
		this.ageMax = ageMax;
		this.prix = prix;
		this.offre = offre;
	}

	public long getIdClasseAge() {
		return idClasseAge;
	}
	public void setIdClasseAge(long idClasseAge) {
		this.idClasseAge = idClasseAge;
	}
	public int getAgeMin() {
		return ageMin;
	}
	public void setAgeMin(int ageMin) {
		this.ageMin = ageMin;
	}
	public int getAgeMax() {
		return ageMax;
	}
	public void setAgeMax(int ageMax) {
		this.ageMax = ageMax;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Offre getOffre() {
		return offre;
	}
	public void setOffre(Offre offre) {
		this.offre = offre;
	}
	
}
