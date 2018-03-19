package beans;

public class OffreBean {
	private long idOffre;
	private String descriptionOffre;
	private int nbPlacesTotales;
	private int nbPlacesRestantes;
	private long idEmploye;
	private long idLieu;
	
	
	public long getIdOffre() {
		return idOffre;
	}
	public void setIdOffre(long idOffre) {
		this.idOffre = idOffre;
	}
	public String getDescriptionOffre() {
		return descriptionOffre;
	}
	public void setDescriptionOffre(String descriptionOffre) {
		this.descriptionOffre = descriptionOffre;
	}
	public int getNbPlacesTotales() {
		return nbPlacesTotales;
	}
	public void setNbPlacesTotales(int nbPlacesTotales) {
		this.nbPlacesTotales = nbPlacesTotales;
	}
	public int getNbPlacesRestantes() {
		return nbPlacesRestantes;
	}
	public void setNbPlacesRestantes(int nbPlacesRestantes) {
		this.nbPlacesRestantes = nbPlacesRestantes;
	}
	public long getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(long idEmploye) {
		this.idEmploye = idEmploye;
	}
	public long getIdLieu() {
		return idLieu;
	}
	public void setIdLieu(long idLieu) {
		this.idLieu = idLieu;
	}
	

}
