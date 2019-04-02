package parser;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SearchTest {

	CrimeADT crime1 = new CrimeADT("P1", "C1", "Residence", 1.32, 1.24,0);
	CrimeADT crime2 = new CrimeADT("P2", "C2", "House", 2.32, 2.24,1);
	CrimeADT crime3 = new CrimeADT("P3", "C3", "School", 6.32, 4.24,2);
	CrimeADT crime4 = new CrimeADT("P4", "C4", "Mall", 8.32, 13.24,3);	
	CrimeADT crime5 = new CrimeADT("P5", "C5", "School", 12.32, 14.24,4);	
	CrimeADT crime6 = new CrimeADT("P6", "C6", "School", 23, 214.24,5);	
	CrimeADT crime7 = new CrimeADT("P7", "C7", "Mall", 77.43, 644.24,6);	

	CrimeADT[] test = {crime1, crime2, crime3, crime4, crime5, crime6, crime7};
	
	
	@Before
	public void setUp() throws Exception {

	}


	@Test
	public void testSearchId() {
		int i = Search.searchId(test, "P7");
		assertTrue(i == 6);
	}
	
	@Test
	public void testSearchOffence() {
		int i = Search.searchOffence(test, "C5");
		assertTrue(i == 4);
	}
	
	@Test
	public void testSearchResidence() {
		int i = Search.searchResidence(test, "Mall");
		assertTrue(i == 3);
	}

	@Test
	public void testSearchLongitude() {
		int l = 0;
		int r = test.length - 1;
		int i = Search.searchLongitude(test, l, r, 8.32);
		assertTrue(i == 3);
	}
	
	@Test
	public void testSearchLatitude() {
		int l = 0;
		int r = test.length - 1;
		int i = Search.searchLatitude(test, l, r, 13.24);
		assertTrue(i == 3);
	}

}
