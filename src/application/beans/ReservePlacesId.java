package application.beans;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ReservePlacesId implements Serializable {
	private ClasseAge classeAge;
	private Reservation reservation;
	
	@ManyToOne
	public ClasseAge getClasseAge() {
		return classeAge;
	}
	public void setClasseAge(ClasseAge classeAge) {
		this.classeAge = classeAge;
	}
	
	@ManyToOne
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		
		ReservePlacesId objet = (ReservePlacesId) o;
		)
	}
	
}
