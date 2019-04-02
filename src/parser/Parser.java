package parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * References Used :
 * 1. https://www.mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
 * 2. SFWR 2XB3 Assignment 1 Product Parser
 * @author pbj
 *
 */

public class Parser {

	public static ArrayList<CrimeADT> csvParser() throws IOException{
		ArrayList<CrimeADT> crimeList = new ArrayList<CrimeADT>();
		
		BufferedReader reader = null;
		String line = "";
		String csvSplitter = ",";
		int count = 0;

		try {
			reader = new BufferedReader(new FileReader("data/Crimes_-_2018.csv"));
			line = reader.readLine();
//			int i = 0;
			while ((line = reader.readLine()) != null) {
				
				//Each Line Split By comma(,)
				String[] crime = line.split(csvSplitter);
				
//				for (int j =0; j < crime.length; j++) {
//					System.out.printf("%d , %s\n",j,crime[j]);
//				}
				
				//id = 0 ; offence = 5 ; residence = 7 ; lat = 19 , long = 20
				//x values = 16 ; y values = 17
				if ( crime[16].equals("") || crime[17].equals(" ") ) {
					continue;
				} else {
					//System.out.println(i++);
					crimeList.add(new CrimeADT(crime[0],crime[5], crime[7], Double.parseDouble(crime[19]),Double.parseDouble(crime[20]), count++));
				}
				
				
			}
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return crimeList;
	}
	
	public static ArrayList<CrimeADT> csvParser(int n) throws IOException{
		ArrayList<CrimeADT> crimeList = new ArrayList<CrimeADT>();
		
		BufferedReader reader = null;
		String line = "";
		String csvSplitter = ",";
		int count = 0;
		
			try {
				reader = new BufferedReader(new FileReader("data/Crimes_-_2018.csv"));
				line = reader.readLine();
	//			int i = 0;
				for (int i=0 ; i < n ; i++) {
					if ((line = reader.readLine()) != null) {
					
					//Each Line Split By comma(,)
					String[] crime = line.split(csvSplitter);
					
	//				for (int j =0; j < crime.length; j++) {
	//					System.out.printf("%d , %s\n",j,crime[j]);
	//				}
					
					//id = 0 ; offence = 5 ; residence = 7 ; lat = 19 , long = 20
					//x values = 16 ; y values = 17
					if ( crime[16].equals("") || crime[17].equals(" ") ) {
						continue;
					} else {
						//System.out.println(i++);
						crimeList.add(new CrimeADT(crime[0],crime[5], crime[7], Double.parseDouble(crime[19]),Double.parseDouble(crime[20]),count++));
					}
					
					}
				}
			}
			
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return crimeList;
		}	
		
		
	
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<CrimeADT> crimeList = csvParser();
		
//		System.out.println(crimeList.size());
//		for (int i =0; i < crimeList.size() ; i++) {
//			System.out.println(crimeList.get(i));
//		}
		
	}

}
