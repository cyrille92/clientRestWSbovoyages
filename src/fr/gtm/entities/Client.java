package fr.gtm.entities;

import java.io.Serializable;

public class Client implements Serializable{
	
	private long id ;
	private String nom ;
	
	public Client () {
		
	}
	
	public Client(String nom) {

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
