package parser;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


import help.Edge;

public class CommandLine {

	/**
	 * Main function that runs the Command Line Interpreter
	 * @param args Arguments provided by the user
	 * @throws IOException thrown when the file is not found
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		CrimeADT crime1 = new CrimeADT("P1", "C1", "Residence", 1.32, 1.24,0);
		CrimeADT crime2 = new CrimeADT("P2", "C2", "House", 2.32, 2.24,1);
		CrimeADT crime3 = new CrimeADT("P3", "C3", "School", 6.32, 4.24,2);
		CrimeADT crime4 = new CrimeADT("P4", "C4", "Mall", 8.32, 13.24,3);	
		CrimeADT crime5 = new CrimeADT("P5", "C5", "School", 12.32, 14.24,4);	
		CrimeADT crime6 = new CrimeADT("P6", "C6", "School", 23, 214.24,5);	
		CrimeADT crime7 = new CrimeADT("P7", "C7", "Mall", 77.43, 644.24,6);	

		CrimeADT[] test = {crime1, crime2, crime3, crime4, crime5, crime6, crime7};
		ArrayList<CrimeADT> crimeList = Parser.csvParser();
		while (true){
			
			System.out.println("***Crime Finder***");
			System.out.print("[Enter 1] Search\n");
			System.out.print("[Enter 2] Graph\n");
			System.out.print("[Enter 3] Exit\n");
			
			Integer option,search_option, Longitude, Latitude;
			String ID, Offence, Residence;
			
			Integer node_1, node_2,nodeId;
			
			Scanner in = new Scanner(System.in);
			option = in.nextInt();

			
			if(option == 1) {
				System.out.print("[Enter 1] Search by ID\n");
				System.out.print("[Enter 2] Search by Offence\n");
				System.out.print("[Enter 3] Search by Residence\n");
				System.out.print("[Enter 4] Search by Longitude\n");
				System.out.print("[Enter 5] Search by Latitude\n");
//				Scanner user_search = new Scanner(System.in);
				search_option = in.nextInt();
//				user_search.close();
				
				if(search_option == 1) {
					System.out.print("Enter ID\n");
//					Scanner user_id = new Scanner(System.in);
					ID = in.next();
//					user_id.close();
//					int i = Search.searchId(test, "P7");
					
//					Search.searchNodeId(test, 0, test.length-1, nodeId);
					int i = Search.searchId(test, ID);
					System.out.println(test[i]);
//					System.out.println(crimeList.get(i).getId());
					
				} else if(search_option == 2){
					System.out.print("Enter Offence\n");
//					Scanner user_offence = new Scanner(System.in);
					Offence = in.nextLine();
//					user_offence.close();
					int i = Search.searchOffence(test, Offence);
					System.out.println(test[i]);
				} else if(search_option == 3){
					System.out.print("Enter Residence\n");
//					Scanner user_residence = new Scanner(System.in);
					Residence = in.nextLine();
//					user_residence.close();
					int i = Search.searchResidence(test, Residence);
					System.out.println(test[i]);
				} else if(search_option == 4){
					System.out.print("Enter Longitude\n");
//					Scanner user_long = new Scanner(System.in);
					Longitude = in.nextInt();
//					user_long.close();
					int i = Search.searchLongitude(test, 0, test.length-1, Longitude);
					System.out.println(test[i]);
				} else if(search_option == 5){
					System.out.print("Enter Latitude\n");
//					Scanner user_lat = new Scanner(System.in);
					Latitude = in.nextInt();
//					user_lat.close();
					int i = Search.searchLatitude(test, 0, test.length-1, Latitude);
					System.out.println(test[i]);
				}
				
			} else if(option == 2) {
				System.out.print("Enter Node ID 1\n");
//				Scanner user_node1 = new Scanner(System.in);
				node_1 = in.nextInt();
//				user_node1.close();
				System.out.print("Enter Node ID 2\n");
//				Scanner user_node2 = new Scanner(System.in);
				node_2 = in.nextInt();
//				user_node2.close();
				
				Graph G = new Graph();
				ShortestPath sp = new ShortestPath(G, node_1);
				if (sp.hasPathTo(node_2)) {
					
					System.out.printf("%d to %d (%.2f)", node_1, node_2, sp.distTo(node_2));
	//				System.out.printf("%s to %s (%.2f)", cityList.get(s).getName(), cityList.get(v).getName(), sp.distTo(v));
					
					for (Edge e : sp.pathTo(node_2)) {	
						System.out.print(e + " ");
					}
					System.out.println();
				}
				else {
					System.out.printf("%d to %d no shortestPath\n",node_1,node_2);
				}
			} else {
				System.exit(0);
			}
			
		System.out.println("----------------------");
		}	
		
	}

}
