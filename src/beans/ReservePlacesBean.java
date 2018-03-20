package beans;

public class ReservePlacesBean {
	private long idReservation;
	private long idOffre;
	private long idClasseAge;
	private int nombre;
	
	
	public long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(long idReservation) {
		this.idReservation = idReservation;
	}
	public long getIdOffre() {
		return idOffre;
	}
	public void setIdOffre(long idOffre) {
		this.idOffre = idOffre;
	}
	public long getIdClasseAge() {
		return idClasseAge;
	}
	public void setIdClasseAge(long idClasseAge) {
		this.idClasseAge = idClasseAge;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
}
