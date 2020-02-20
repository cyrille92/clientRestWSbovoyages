package fr.gtm.pojo;

public class Voyage {
	
private long id ;
	
	private String region ;
	private String descriptif ;
	
	private Client client ;	
	private DatesVoyage ddv ;
	
	
	public Voyage() {
		
	}
	public Voyage(long id, String region, String descriptif, Client client, DatesVoyage ddv) {
		super();
		this.id = id;
		this.region = region;
		this.descriptif = descriptif;
		this.client = client;
		this.ddv = ddv;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getDescriptif() {
		return descriptif;
	}
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public DatesVoyage getDdv() {
		return ddv;
	}
	public void setDdv(DatesVoyage ddv) {
		this.ddv = ddv;
	}
	@Override
	public String toString() {
		return "Voyage [id=" + id + ", region=" + region + ", descriptif=" + descriptif + ", client=" + client
				+ ", ddv=" + ddv + "]";
	}

	
	

}
