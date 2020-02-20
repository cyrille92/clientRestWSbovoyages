package fr.gtm.testsentities;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import fr.gtm.entities.DatesVoyage;

public class TestDatesVoyage {
	
	private LocalDate date1 = LocalDate.now() ;
	private LocalDate date2 = LocalDate.of(2020, Month.AUGUST, 1) ;
	
	private DatesVoyage datesVoyage = new DatesVoyage(date1, date2, 5 , 700.0);

	@Test
	public void testDatesVoyagesConstructeur() {
		assertEquals(date1, datesVoyage.getDateAller());
		assertEquals(date2,  datesVoyage.getDateRetour());
		assertEquals(5, datesVoyage.getNbPlaces());	
		assertEquals(700.0, datesVoyage.getPrixHT(), 0.0001);
	}
	
	
	@Test
	public void testDatesVoyageLocalDateLocalDateIntDouble() {
		assertNotNull(datesVoyage);
	}

	@Test
	public void testGetId() {
		assertNotNull(datesVoyage.getId());
		
	}

	@Test
	public void testGetDateAller() {
		assertNotNull(datesVoyage.getDateAller()) ;
		assertEquals(date1, datesVoyage.getDateAller());
	}

	@Test
	public void testSetDateAller() {
		datesVoyage.setDateAller(date2);
		assertEquals(date2, datesVoyage.getDateAller());
	}

	@Test
	public void testGetDateRetour() {
		assertEquals(date2, datesVoyage.getDateRetour());
	}

	@Test
	public void testSetDateRetour() {
		datesVoyage.setDateRetour(date1);
		assertEquals(date1, datesVoyage.getDateRetour());
		
	
	}

	@Test
	public void testGetNbPlaces() {
		assertEquals(5, datesVoyage.getNbPlaces());
	}

	@Test
	public void testSetNbPlaces() {
		datesVoyage.setNbPlaces(8);;
		assertEquals(8, datesVoyage.getNbPlaces());
	}


	@Test
	public void testGetPrixHT() {
		assertEquals(700.0, datesVoyage.getPrixHT(), 0.0001);
	}

	@Test
	public void testSetPrixHT() {
		datesVoyage.setPrixHT(900.0);
		assertEquals(900.0, datesVoyage.getPrixHT(), 0.0001);
	}
}
