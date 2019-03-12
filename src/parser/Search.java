package parser;

public class Search {
	
	public static int binarySearch(Comparable[] x, int lo, int hi, Comparable val){
		if (lo == hi) {
			return lo;
		}
		int mid = lo + ((hi - lo) / 2);
		
		if (val.compareTo(x[mid]) == 1) {
			return binarySearch(x, mid+1, hi, val);
		}
		else if (val.compareTo(x[mid]) == -1) {
			return binarySearch(x, lo, mid, val);
		}
		
		return mid;
	}
	
	public static int linearSearch(int arr[], int x) 
	{ 
	    int n = arr.length; 
	    for(int i = 0; i < n; i++) 
	    { 
	        if(arr[i] == x) 
	            return i; 
	    } 
	    return -1; 
	} 
	
	

}
