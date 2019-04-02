package parser;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ParserTest {
	
	ArrayList<CrimeADT> crimeList;
	ArrayList<CrimeADT> testList;
	
	@Before
	public void setUp() throws Exception {
		crimeList = Parser.csvParser();
		System.out.println(crimeList.size()/2);
		testList = Parser.csvParser(20);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testParser() {
		//System.out.println(testList.size());
//		System.out.println(testList.get(0));
//		System.out.println(crimeList.get(0));
		assertTrue(crimeList.get(0).compareId( testList.get(0) ) == 0);
		assertTrue(crimeList.get(0).compareLongitude( testList.get(0) ) >= 0);
		assertTrue(crimeList.get(0).compareLatitude( testList.get(0) ) >= 0);

		for (int i =0 ; i < testList.size(); i++) {
			System.out.println(testList.get(i));
		}
		
		
	}

}
