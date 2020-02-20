package fr.gtm.tests;

import static org.junit.Assert.*;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.junit.Test;

import fr.gtm.pojo.Destination;


public class TestDestinationService {
	
	private static final String url = "http://localhost:8080/projet3bovoyagewebservice_rest/rest/destinations" ;
	
	Client client = ClientBuilder.newClient() ;
	
	@Test
	public void testGetAllDestination() {
		
		WebTarget target = client.target(url + "/All") ;
		Destination[] destination = target.request(MediaType.APPLICATION_JSON).
				get(Destination[].class) ;
		for(Destination d : destination) {
		assertNotNull(d);
		}
	}
	@Test 
	public void testGetAllRegion() {

		WebTarget target = client.target(url + "/Allregion") ;
		Destination[] destination = target.request(MediaType.APPLICATION_JSON).
				get(Destination[].class) ;
		
		assertNotNull(destination);	
		
	}
	

}
	
	
	
	