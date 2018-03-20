package application.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	
	

	public ClasseAge() {
	}
	
	public ClasseAge(int ageMin, int ageMax) {
		this.ageMin = ageMin;
		this.ageMax = ageMax;
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
