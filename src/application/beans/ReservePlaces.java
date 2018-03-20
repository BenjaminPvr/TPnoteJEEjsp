package application.beans;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Entity
@AssociationOverrides({
	@AssociationOverride(name = "clePrimaire.classeAge", 
		joinColumns = @JoinColumn(name = "ClasseAge_idClasseAge")),
	@AssociationOverride(name = "clePrimaire.reservation", 
		joinColumns = @JoinColumn(name = "Reservation_idReservation")) })
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
}
