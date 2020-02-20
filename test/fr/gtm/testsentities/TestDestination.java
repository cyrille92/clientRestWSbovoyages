package fr.gtm.testsentities;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.gtm.entities.Destination;

public class TestDestination {

	Destination d1 = new Destination();
	Destination d2 = new Destination("Corse", "Decouvrez la Corse", null);
	
	@Test
	public void testDestination() {
		assertNotNull(d1);
	}

	@Test
	public void testDestinationStringString() {
		assertNotNull(d2);
	}

	@Test
	public void testGetId() {
		Destination d1 = new Destination();
		assertTrue(d1.getId()==0);
	}

	@Test
	public void testGetRegion() {
		assertEquals("Corse", d2.getRegion());
	}

	@Test
	public void testSetRegion() {
		d1.setRegion("Bretagne");
		assertEquals("Bretagne",d1.getRegion());
	}
	
	@Test
	public void testGetDescription() {
		assertEquals("Decouvrez la Corse", d2.getDescription());
	}

	@Test
	public void testSetDescription() {
		d1.setDescription("Bienvenue en Bretagne");
		assertEquals("Bienvenue en Bretagne", d1.getDescription());
	}


}

