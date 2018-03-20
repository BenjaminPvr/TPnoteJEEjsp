package application.beans;

public class ReservePlaces {
	private Reservation reservation;
	private Offre offre;
	private ClasseAge classeAge;
	private int nombre;
	
	public ReservePlaces() {
		super();
	}
	
	public ReservePlaces(Reservation reservation, Offre offre, ClasseAge classeAge, int nombre) {
		super();
		this.reservation = reservation;
		this.offre = offre;
		this.classeAge = classeAge;
		this.nombre = nombre;
	}

	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
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
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
}
