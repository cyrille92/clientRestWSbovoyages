package fr.gtm.entities;

import java.io.Serializable;
import java.util.List;

public class Destination implements Serializable{
	
	private long id ;
	private String description ;
	private String region ;
	private List<DatesVoyage> datesVoyages;
	
	
	public Destination () {
		
	}


	
	
	
	public Destination(String description, String region, List<DatesVoyage> datesVoyages) {
		super();
		this.description = description;
		this.region = region;
		this.datesVoyages = datesVoyages;
	}





	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}
	
	


	public List<DatesVoyage> getDatesVoyages() {
		return datesVoyages;
	}





	public void setDatesVoyages(List<DatesVoyage> datesVoyages) {
		this.datesVoyages = datesVoyages;
	}





	@Override
	public String toString() {
		return "Destination [id=" + id + ", description=" + description + ", region=" + region + "]";
	}
	
	
	
	
}
