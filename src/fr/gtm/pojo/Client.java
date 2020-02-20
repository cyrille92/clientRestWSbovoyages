package fr.gtm.pojo;

public class Client {
	
	private long id ;
	private String nom ;
	
	public Client () {
		
	}
	
	public Client(long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + "]";
	}
	
	

}
