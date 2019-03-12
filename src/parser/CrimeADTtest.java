package parser;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CrimeADTtest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCrimeADT() {
		CrimeADT crime1 = new CrimeADT("123", "theft", "residence", 1.32, 3.24);
		CrimeADT crime2 = new CrimeADT("223", "theft", "house", 2.32, 4.24);
		System.out.println(crime1.getId());
		System.out.println(crime1.getOffence());
		System.out.println(crime1.getResidence());
		System.out.println(crime1.getLongitude());
		System.out.println(crime1.getLatitude());
		System.out.println(crime1.toString());
	}

	@Test
	public void testCompare() {
		CrimeADT crime1 = new CrimeADT("123", "theft", "residence", 1.32, 3.24);
		CrimeADT crime2 = new CrimeADT("223", "theft", "house", 2.32, 4.24);
		
		assertTrue(crime1.compareId(crime2)<0);
		assertTrue(crime1.compareOffence(crime2)==0);
		assertTrue(crime1.compareResidence(crime2)>0);
		assertTrue(crime1.compareLongitude(crime2)<0);
		assertTrue(crime1.compareLatitude(crime2)<0);

	}

}
