package application.beans;

import java.sql.Date;

public class Reservation {
	private long idReservation;
	private Date dateReservation;
	private String nomClient;
	private String prenomClient;
	private String adresseMail;
	
	public Reservation() {
		super();
	}
	
	public Reservation(long idReservation, Date dateReservation, String nomClient, String prenomClient,
			String adresseMail) {
		super();
		this.idReservation = idReservation;
		this.dateReservation = dateReservation;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.adresseMail = adresseMail;
	}

	public long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(long idReservation) {
		this.idReservation = idReservation;
	}
	public Date getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public String getAdresseMail() {
		return adresseMail;
	}
	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}
	
}
