package application.beans;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ReservePlacesId implements Serializable {
	@ManyToOne
	private ClasseAge classeAge;
	@ManyToOne
	private Reservation reservation;
	
	public ReservePlacesId() {
	}
	
	public ClasseAge getClasseAge() {
		return classeAge;
	}
	public void setClasseAge(ClasseAge classeAge) {
		this.classeAge = classeAge;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

}
