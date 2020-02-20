package fr.gtm.testsentities;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.gtm.entities.Client;

public class TestClient {
	
	private Client client =  new Client("Richard") ;

	@Test
	public void testClientConstructeur() {
		assertEquals("Richard", client.getNom());
	}
	@Test
	public void testGetNom() {
		assertEquals(client.getNom(), "Richard");
	}
	@Test
	public void testSetNom() {
		client.setNom("Vincent");
		assertEquals("Vincent", client.getNom());
	}
	@Test
	public void testGetId() {	
		assertNotNull(client.getId());
	}	
}
