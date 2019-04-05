package parser;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import help.Edge;

public class ShortestPathTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testShortestPath() throws IOException {
		Graph G = new Graph();
		boolean flag = true;
		int s = 0;
		int v = 50;
		ShortestPath sp = new ShortestPath(G, s);
		String compareShortestPath = "0 to 50 (25.00)0-2 1.000 2-4 1.000 4-6 1.000 6-8 1.000 8-10 1.000 10-12 1.000 12-14 1.000 14-16 1.000 16-18 1.000 18-20 1.000 20-22 1.000 22-24 1.000 24-26 1.000 26-28 1.000 28-30 1.000 30-32 1.000 32-34 1.000 34-36 1.000 36-38 1.000 38-40 1.000 40-42 1.000 42-44 1.000 44-46 1.000 46-48 1.000 48-50 1.000 ";

		String stringBuilder = "";
		if (sp.hasPathTo(v)) {
				stringBuilder += s + " to " + v + " (25.00)";
				for (Edge e : sp.pathTo(v)) {	
					stringBuilder += e + " ";
				}
				stringBuilder += "\n";
		}
		else {
				stringBuilder += s + " to " + v + " no shortestPath\n";
		}
		
		System.out.println(stringBuilder);
		if (compareShortestPath.equals(stringBuilder)) {
			flag = false;
		}
		assertTrue(flag);
		
		
		
	}
	
	
	

}
