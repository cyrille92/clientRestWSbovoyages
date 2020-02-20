package fr.gtm.pojo;

import java.io.Serializable;

public class Destination implements Serializable{
	
	private long id ;
	private String description ;
	private String region ;
	
	
	public Destination () {
		
	}


	public Destination (String description, String region) {


		this.description = description;
		this.region = region;
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


	@Override
	public String toString() {
		return "Destination [id=" + id + ", description=" + description + ", region=" + region + "]";
	}
	
	
	
	
}
