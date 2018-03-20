package application.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pays {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPays;
	private String nomPays;
	private String commentairePays;
	@OneToMany(mappedBy="pays", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Set<Lieu> lieuxDansPays;
	
	public Pays() {
		lieuxDansPays = new HashSet<>(0);
	}
	
	public Pays(long idPays, String nomPays, String commentairePays) {
		this();
		this.idPays = idPays;
		this.nomPays = nomPays;
		this.commentairePays = commentairePays;
	}

	public long getIdPays() {
		return idPays;
	}
	public void setIdPays(long idPays) {
		this.idPays = idPays;
	}
	public String getNomPays() {
		return nomPays;
	}
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	public String getCommentairePays() {
		return commentairePays;
	}
	public void setCommentairePays(String commentairePays) {
		this.commentairePays = commentairePays;
	}
	
}
