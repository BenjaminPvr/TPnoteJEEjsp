package application.beans;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Transient;

@Entity
@AssociationOverrides({
	@AssociationOverride(name = "clePrimaire.reservation", 
		joinColumns = @JoinColumn(name = "Reservation_idReservation")),
	@AssociationOverride(name = "clePrimaire.classeAge", 
	joinColumns = @JoinColumn(name = "ClasseAge_idClasseAge")) })
public class ReservePlaces implements Serializable {
	@EmbeddedId
	private ReservePlacesId clePrimaire = new ReservePlacesId();
	private int nombre;
	
	public ReservePlaces() {
	}
	public ReservePlacesId getClePrimaire() {
		return clePrimaire;
	}
	public void setClePrimaire(ReservePlacesId clePrimaire) {
		this.clePrimaire = clePrimaire;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	@Transient
	public Reservation getReservation() {
		return clePrimaire.getReservation();
	}
	public void setReservation(Reservation reservation) {
		clePrimaire.setReservation(reservation);
	}
	@Transient
	public ClasseAge getClasseAge() {
		return clePrimaire.getClasseAge();
	}
	public void setClasseAge(ClasseAge classeAge) {
		clePrimaire.setClasseAge(classeAge);
	}
}
