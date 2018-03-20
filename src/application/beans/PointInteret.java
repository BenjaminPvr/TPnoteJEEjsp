package application.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PointInteret {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPointInteret;
	private String nomPointInteret;
	private String commentairePointInteret;
	@ManyToOne
	private Lieu lieu;
	
	public PointInteret() {
		super();
	}
	
	public PointInteret(long idPointInteret, String nomPointInteret, String commentairePointInteret,
			Lieu lieu) {
		super();
		this.idPointInteret = idPointInteret;
		this.nomPointInteret = nomPointInteret;
		this.commentairePointInteret = commentairePointInteret;
		this.lieu = lieu;
	}

	public long getIdPointInteret() {
		return idPointInteret;
	}
	public void setIdPointInteret(long idPointInteret) {
		this.idPointInteret = idPointInteret;
	}
	public String getNomPointInteret() {
		return nomPointInteret;
	}
	public void setNomPointInteret(String nomPointInteret) {
		this.nomPointInteret = nomPointInteret;
	}
	public String getCommentairePointInteret() {
		return commentairePointInteret;
	}
	public void setCommentairePointInteret(String commentairePointInteret) {
		this.commentairePointInteret = commentairePointInteret;
	}
	public Lieu getLieu() {
		return lieu;
	}
	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

}
