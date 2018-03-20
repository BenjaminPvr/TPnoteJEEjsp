package application.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Activite {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idActivite;
	private String nomActivite;
	@OneToMany(mappedBy="Lieu")
	private Set<Lieu> disponibleDansLieux;
	
	public Activite() {
	}
	
	public Activite(String nomActivite) {
		this.nomActivite = nomActivite;
	}

	public long getIdActivite() {
		return idActivite;
	}
	public void setIdActivite(long idActivite) {
		this.idActivite = idActivite;
	}
	public String getNomActivite() {
		return nomActivite;
	}
	public void setNomActivite(String nomActivite) {
		this.nomActivite = nomActivite;
	}
	public Set<Lieu> getDisponibleDansLieux() {
		return disponibleDansLieux;
	}
	public void setDisponibleDansLieux(Set<Lieu> disponibleDansLieux) {
		this.disponibleDansLieux = disponibleDansLieux;
	}
	
}
