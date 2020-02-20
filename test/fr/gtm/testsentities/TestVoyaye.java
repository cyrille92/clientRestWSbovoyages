package fr.gtm.testsentities;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import fr.gtm.entities.Client;
import fr.gtm.entities.DatesVoyage;
import fr.gtm.entities.Voyage;

public class TestVoyaye {
	
	private Client client = new Client("Thomas") ;	
	
	private LocalDate date1 = LocalDate.now() ;
	private LocalDate date2 = LocalDate.of(2020, Month.AUGUST, 1) ;
	
	private DatesVoyage datesVoyage = new DatesVoyage(date1, date2, 5 , 700.0);

	private Voyage voyages = new Voyage("Paris", "une belle ville", client , datesVoyage);
	
	
	@Test
	public void testVoyageConstructeur() {
		assertEquals("Paris", voyages.getRegion());
		assertEquals("une belle ville", voyages.getDescriptif());
		assertEquals(client, voyages.getClient());	
		assertEquals(datesVoyage, voyages.getDdv());
	}
	
	@Test
	public void testGetId() {
		assertNotNull(voyages.getId());
	}

	@Test
	public void testGetRegion() {
		assertNotNull(voyages.getRegion());
	}

	@Test
	public void testSetRegion() {
		voyages.setRegion("Montpelier");
		assertEquals("Montpelier", voyages.getRegion());
	}

	@Test
	public void testGetDescriptif() {
		assertNotNull(voyages.getDescriptif());
		}

	@Test
	public void testSetDescriptif() {
		voyages.setDescriptif("moins belle");
		assertEquals("moins belle", voyages.getDescriptif());
	}

	@Test
	public void testGetClient() {
		assertNotNull(voyages.getClient());
		
	}

	@Test
	public void testSetClient() {
		Client client2 = new Client() ;
		voyages.setClient(client2);
		assertEquals(client2, voyages.getClient());
		
	}

	@Test
	public void testGetDdv() {
		assertNotNull(voyages.getClient());
		
	}

	@Test
	public void testSetDdv() {
		DatesVoyage dateVoyage2 = new DatesVoyage() ;
		voyages.setDdv(dateVoyage2);
		assertEquals(dateVoyage2, voyages.getDdv());
	}
}
