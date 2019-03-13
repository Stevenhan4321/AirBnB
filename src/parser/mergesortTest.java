package parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class mergesortTest {
	
	CrimeADT crime1 = new CrimeADT("P1", "C1", "Residence", 1.32, 1.24);
	CrimeADT crime2 = new CrimeADT("P2", "C2", "House", 2.32, 2.24);
	CrimeADT crime3 = new CrimeADT("P3", "C1", "School", 6.32, 4.24);
	CrimeADT crime4 = new CrimeADT("P4", "C6", "Mall", 8.32, 13.24);	
	CrimeADT crime5 = new CrimeADT("P5", "C3", "School", 12.32, 14.24);	
	CrimeADT crime6 = new CrimeADT("P6", "C6", "School", 23, 214.24);	
	CrimeADT crime7 = new CrimeADT("P7", "C0", "Mall", 77.43, 644.24);	

	CrimeADT[] test = {crime1, crime2, crime3, crime4, crime5, crime6, crime7};

	@Test
	public void testId() 
	{		
		int n = test.length;
		mergesort.sortId(test, n);		
		for (int j = 0; j < test.length - 1; j++) {
			assertTrue(test[j].getId().compareTo(test[j+1].getId()) <= 0);
		}
	}

	
	@Test
	public void testOffence() 
	{		
		int n = test.length;
		mergesort.sortOffence(test, n);		
		for (int j = 0; j < test.length - 1; j++) {
			assertTrue(test[j].getOffence().compareTo(test[j+1].getOffence()) <= 0);
		}
	}

	
	@Test
	public void testResidence() 
	{		
		int n = test.length;
		mergesort.sortResidence(test, n);		
		//for (int j = 0; j<test.length -1; j++) {
			//System.out.println(test[j].getResidence());
		//}
		for (int j = 0; j < test.length - 1; j++) {
			assertTrue(test[j].getResidence().compareTo(test[j+1].getResidence()) <= 0);
		}
	}
}
