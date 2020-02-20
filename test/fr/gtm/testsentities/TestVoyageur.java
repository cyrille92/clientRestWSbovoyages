package fr.gtm.testsentities;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import fr.gtm.entities.Voyageur;

public class TestVoyageur {
	
	private LocalDate date1 = LocalDate.now() ;
	private LocalDate date2 = LocalDate.of(2020, Month.AUGUST, 1) ;
	
	
	Voyageur voyageurs = new Voyageur("Mme", "DUBOIS", "Vincent", date1) ;
	


	@Test
	public void testVoyageurConstructeur() {
		assertEquals("Mme", voyageurs.getCivilite());
		assertEquals("DUBOIS", voyageurs.getNom());
		assertEquals("Vincent", voyageurs.getPrenom());	
		assertEquals(date1, voyageurs.getDateNaissance());
	}

	@Test
	public void testGetId() {
		assertNotNull(voyageurs.getId());
	}

	@Test
	public void testGetCivilite() {
		assertNotNull(voyageurs.getCivilite());
	}

	@Test
	public void testSetCivilite() {
		voyageurs.setCivilite("M");
		assertEquals("M", voyageurs.getCivilite());
		
	}

	@Test
	public void testGetNom() {
		assertNotNull(voyageurs.getNom());
	}

	@Test
	public void testSetNom() {
		voyageurs.setNom("BERNARDO");
		assertEquals("BERNARDO", voyageurs.getNom());
	}

	@Test
	public void testGetPrenom() {
		assertNotNull(voyageurs.getPrenom());
	}

	@Test
	public void testSetPrenom() {
		voyageurs.setPrenom("Louis");
		assertEquals("Louis", voyageurs.getPrenom());
	}

	@Test
	public void testGetDateNaissance() {
		assertNotNull(voyageurs.getDateNaissance());
	}

	@Test
	public void testSetDateNaissance() {
		
		voyageurs.setDateNaissance(date2);;
		assertEquals(date2, voyageurs.getDateNaissance());
	}

}
