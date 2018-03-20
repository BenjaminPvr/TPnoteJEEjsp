package application.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Lieu {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idLieu;
	private String nomLieu;
	private String commentaireLieu;
	@ManyToOne
	private Pays pays;
	@OneToMany(mappedBy="PointInteret")
	private Set<PointInteret> possedePointsInteret;
	@OneToMany(mappedBy="Activite")
	private Set<Activite> proposeActivites;
	@OneToMany(mappedBy="Offre")
	private Set<Offre> disponibleDansOffres;
	
	public Lieu() {
	}
	
	public Lieu(String nomLieu, String commentaireLieu, Pays pays) {
		this.nomLieu = nomLieu;
		this.commentaireLieu = commentaireLieu;
		this.pays = pays;
	}

	public long getIdLieu() {
		return idLieu;
	}
	public void setIdLieu(long idLieu) {
		this.idLieu = idLieu;
	}
	public String getNomLieu() {
		return nomLieu;
	}
	public void setNomLieu(String nomLieu) {
		this.nomLieu = nomLieu;
	}
	public String getCommentaireLieu() {
		return commentaireLieu;
	}
	public void setCommentaireLieu(String commentaireLieu) {
		this.commentaireLieu = commentaireLieu;
	}
	public Pays getPays() {
		return pays;
	}
	public void setPays(Pays pays) {
		this.pays = pays;
	}
	public Set<Activite> getProposeActivites() {
		return proposeActivites;
	}
	public void setProposeActivites(Set<Activite> proposeActivites) {
		this.proposeActivites = proposeActivites;
	}
	public Set<PointInteret> getPossedePointsInteret() {
		return possedePointsInteret;
	}
	public void setPossedePointsInteret(Set<PointInteret> possedePointsInteret) {
		this.possedePointsInteret = possedePointsInteret;
	}
	public Set<Offre> getDisponibleDansOffres() {
		return disponibleDansOffres;
	}
	public void setDisponibleDansOffres(Set<Offre> disponibleDansOffres) {
		this.disponibleDansOffres = disponibleDansOffres;
	}
		
}
