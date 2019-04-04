package parser;
import java.util.Scanner;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CrimeADT crime1 = new CrimeADT("P1", "C1", "Residence", 1.32, 1.24,0);
		CrimeADT crime2 = new CrimeADT("P2", "C2", "House", 2.32, 2.24,1);
		CrimeADT crime3 = new CrimeADT("P3", "C3", "School", 6.32, 4.24,2);
		CrimeADT crime4 = new CrimeADT("P4", "C4", "Mall", 8.32, 13.24,3);	
		CrimeADT crime5 = new CrimeADT("P5", "C5", "School", 12.32, 14.24,4);	
		CrimeADT crime6 = new CrimeADT("P6", "C6", "School", 23, 214.24,5);	
		CrimeADT crime7 = new CrimeADT("P7", "C7", "Mall", 77.43, 644.24,6);	

		CrimeADT[] test = {crime1, crime2, crime3, crime4, crime5, crime6, crime7};
		
		System.out.print("[Enter 1] Search\n");
		System.out.print("[Enter 2] Graph\n");
		System.out.print("[Enter 3] Exit\n");
		
		Integer option,search_option, Longitude, Latitude;
		String ID, Offence, Residence;
		
		Scanner user_option = new Scanner(System.in);
		option = user_option.nextInt();
		user_option.close();
		
		if(option == 1) {
			System.out.print("[Enter 1] Search by ID\n");
			System.out.print("[Enter 2] Search by Offence\n");
			System.out.print("[Enter 3] Search by Residence\n");
			System.out.print("[Enter 4] Search by Longitude\n");
			System.out.print("[Enter 5] Search by Latitude\n");
			Scanner user_search = new Scanner(System.in);
			search_option = user_search.nextInt();
			user_search.close();
			
			if(search_option == 1) {
				System.out.print("Enter ID");
				Scanner user_id = new Scanner(System.in);
				ID = user_id.nextLine();
				user_id.close();
				Search.searchId(test, ID);
			} else if(search_option == 2){
				System.out.print("Enter Offence");
				Scanner user_offence = new Scanner(System.in);
				Offence = user_offence.nextLine();
				user_offence.close();
				Search.searchOffence(test, Offence);
			} else if(search_option == 3){
				System.out.print("Enter Residence");
				Scanner user_residence = new Scanner(System.in);
				Residence = user_residence.nextLine();
				user_residence.close();
				Search.searchResidence(test, Residence);
			} else if(search_option == 4){
				System.out.print("Enter Longitude");
				Scanner user_long = new Scanner(System.in);
				Longitude = user_long.nextInt();
				user_long.close();
				Search.searchLongitude(test, 0, test.length-1, Longitude);
			} else if(search_option == 5){
				System.out.print("Enter Latitude");
				Scanner user_lat = new Scanner(System.in);
				Latitude = user_lat.nextInt();
				user_lat.close();
				Search.searchLatitude(test, 0, test.length-1, Latitude);
			}
			
		} else if(option == 2) {
			System.out.print("INPUT GRAPH ALGORITHM");
		} else {
			System.exit(0);
		}
	}

}
