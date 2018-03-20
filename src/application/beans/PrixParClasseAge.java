package application.beans;

public class PrixParClasseAge {
	private Offre offre;
	private ClasseAge classeAge;
	private double prix;
	
	public PrixParClasseAge() {
		super();
	}
	
	public PrixParClasseAge(Offre offre, ClasseAge classeAge, double prix) {
		super();
		this.offre = offre;
		this.classeAge = classeAge;
		this.prix = prix;
	}

	public Offre getOffre() {
		return offre;
	}
	public void setOffre(Offre offre) {
		this.offre = offre;
	}
	public ClasseAge getClasseAge() {
		return classeAge;
	}
	public void setClasseAge(ClasseAge classeAge) {
		this.classeAge = classeAge;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
}
