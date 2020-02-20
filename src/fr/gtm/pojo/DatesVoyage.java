package fr.gtm.pojo;

import java.io.Serializable;
import java.time.LocalDate;


public class DatesVoyage implements Serializable{
	
	
	private long id ;
	
	private LocalDate dateAller ;

	private LocalDate dateRetour ;
	
	private int nbPlaces ;
	private double prixHT ;
		
	public DatesVoyage() {
		
	}

	public DatesVoyage(LocalDate dateAller, LocalDate dateRetour, int nbPlaces, double prixHT) {
	
		this.dateAller = dateAller;
		this.dateRetour = dateRetour;
		this.nbPlaces = nbPlaces;
		this.prixHT = prixHT;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getDateAller() {
		return dateAller;
	}

	public void setDateAller(LocalDate dateAller) {
		this.dateAller = dateAller;
	}

	public LocalDate getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(LocalDate dateRetour) {
		this.dateRetour = dateRetour;
	}

	public int getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	@Override
	public String toString() {
		return "DatesVoyage [id=" + id + ", dateAller=" + dateAller + ", dateRetour=" + dateRetour + ", nbPlaces="
				+ nbPlaces + ", prixHT=" + prixHT + "]";
	}
	
	

}
