
public class quicksort {
	public static void sortBasicQuick_Id (  CrimeADT[] x ) {
       shuffle(x);
       sort_Id(x, 0, x.length - 1);
       assert isSorted_Id(x, 0, x.length-1);  
	}
   private static void sort_Id(Comparable[] a, int lo, int hi) { 
       if (hi <= lo) return;
       int j = partition_Id(a, lo, hi);
       sort_Id(a, lo, j-1);
       sort_Id(a, j+1, hi);
       assert isSorted_Id(a, lo, hi);
   }
   private static int partition_Id(Comparable[] a, int lo, int hi) {
       int i = lo;
       int j = hi + 1;
       Comparable v = a[lo];
       while (true) { 

           while (less_Id(a[++i], v)) {
               if (i == hi) break;
           }


           while (less_Id(v, a[--j])) {
               if (j == lo) break;      
           }

           if (i >= j) break;

           exch(a, i, j);
       }
       exch(a, lo, j);
       return j;
   }
   private static boolean less_Id(Comparable v, Comparable w) {
       return v.compareId(w) < 0;
   }
   private static void exch(Object[] a, int i, int j) {
       Object swap = a[i];
       a[i] = a[j];
       a[j] = swap;
   }
   private static boolean isSorted_Id(Comparable[] a, int lo, int hi) {
       for (int i = lo + 1; i <= hi; i++)
           if (less_Id(a[i], a[i-1])) return false;
       return true;
   }
   public static void shuffle(Comparable[] a) {
       int n = a.length;
       for (int i = 0; i < n; i++) {
           int r = i + (int) (Math.random() * (n-i));   // between i and n-1
           exch(a, i, r);
       }
   }
//    Sorting based on offense -->(next lines)
       
   public static void sortBasicQuick_offense( CrimeADT[] x ) {
	      shuffle(x);
	       sort_offense(x, 0, x.length - 1);
	       assert isSorted_offense(x, 0, x.length-1);
   }
   public static void sort_offense(Comparable[] a, int lo, int hi) {
       if (hi <= lo) return;
       int j = partition_Id(a, lo, hi);
       sort_offense(a, lo, j-1);
       sort_offense(a, j+1, hi);
       assert isSorted_offense(a, lo, hi);
   }
   private static int partition_offense(Comparable[] a, int lo, int hi) {
       int i = lo;
       int j = hi + 1;
       Comparable v = a[lo];
       while (true) { 

           while (less_offense(a[++i], v)) {
               if (i == hi) break;
           }


           while (less_offense(v, a[--j])) {
               if (j == lo) break;      
           }

           if (i >= j) break;

           exch(a, i, j);
       }
       exch(a, lo, j);
       return j;
   }
   private static boolean less_offense(Comparable v, Comparable w) {
       return v.compareOffense(w) < 0;
   }
   private static boolean isSorted_offense(Comparable[] a, int lo, int hi) {
       for (int i = lo + 1; i <= hi; i++)
           if (less_offense(a[i], a[i-1])) return false;
       return true;
   }
 
// sort based on residence -->(next lines)
   
   public static void sortBasicQuick_residence( CrimeADT[] x ) {
	      shuffle(x);
	       sort_residence(x, 0, x.length - 1);
	       assert isSorted_residence(x, 0, x.length-1);
}
public static void sort_residence(Comparable[] a, int lo, int hi) {
    if (hi <= lo) return;
    int j = partition_Id(a, lo, hi);
    sort_residence(a, lo, j-1);
    sort_residence(a, j+1, hi);
    assert isSorted_residence(a, lo, hi);
}
private static int partition_residence(Comparable[] a, int lo, int hi) {
    int i = lo;
    int j = hi + 1;
    Comparable v = a[lo];
    while (true) { 

        while (less_residence(a[++i], v)) {
            if (i == hi) break;
        }


        while (less_residence(v, a[--j])) {
            if (j == lo) break;      
        }

        if (i >= j) break;

        exch(a, i, j);
    }
    exch(a, lo, j);
    return j;
}
private static boolean less_residence(Comparable v, Comparable w) {
    return v.compareResidence(w) < 0;
}
private static boolean isSorted_residence(Comparable[] a, int lo, int hi) {
    for (int i = lo + 1; i <= hi; i++)
        if (less_residence(a[i], a[i-1])) return false;
    return true;
}
   
// sort based on longitude -->(next lines)

public static void sortBasicQuick_longitude( CrimeADT[] x ) {
    shuffle(x);
     sort_longitude(x, 0, x.length - 1);
     assert isSorted_longitude(x, 0, x.length-1);
}
public static void sort_longitude(Comparable[] a, int lo, int hi) {
if (hi <= lo) return;
int j = partition_longitude(a, lo, hi);
sort_longitude(a, lo, j-1);
sort_longitude(a, j+1, hi);
assert isSorted_longitude(a, lo, hi);
}
private static int partition_longitude(Comparable[] a, int lo, int hi) {
int i = lo;
int j = hi + 1;
Comparable v = a[lo];
while (true) { 

  while (less_longitude(a[++i], v)) {
      if (i == hi) break;
  }


  while (less_longitude(v, a[--j])) {
      if (j == lo) break;      
  }

  if (i >= j) break;

  exch(a, i, j);
}
exch(a, lo, j);
return j;
}
private static boolean less_longitude(Comparable v, Comparable w) {
return v.compareLongitude(w) < 0;
}
private static boolean isSorted_longitude(Comparable[] a, int lo, int hi) {
for (int i = lo + 1; i <= hi; i++)
  if (less_longitude(a[i], a[i-1])) return false;
return true;
}

// comparing based on latitude -->(next lines)

public static void sortBasicQuick_latitude( CrimeADT[] x ) {
    shuffle(x);
     sort_latitude(x, 0, x.length - 1);
     assert isSorted_latitude(x, 0, x.length-1);
}
public static void sort_latitude(Comparable[] a, int lo, int hi) {
if (hi <= lo) return;
int j = partition_latitude(a, lo, hi);
sort_latitude(a, lo, j-1);
sort_latitude(a, j+1, hi);
assert isSorted_latitude(a, lo, hi);
}
private static int partition_latitude(Comparable[] a, int lo, int hi) {
int i = lo;
int j = hi + 1;
Comparable v = a[lo];
while (true) { 

  while (less_latitude(a[++i], v)) {
      if (i == hi) break;
  }


  while (less_latitude(v, a[--j])) {
      if (j == lo) break;      
  }

  if (i >= j) break;

  exch(a, i, j);
}
exch(a, lo, j);
return j;
}
private static boolean less_latitude(Comparable v, Comparable w) {
return v.compareLatitude(w) < 0;
}
private static boolean isSorted_latitude(Comparable[] a, int lo, int hi) {
for (int i = lo + 1; i <= hi; i++)
  if (less_longitude(a[i], a[i-1])) return false;
return true;
}



   
	/**
	 * three partition quick sort using Comparable
	 * @param x - the input array containing products that need to be sorted.
	 * @param n - the size of the input array
	 */

   
       
	public static void main(String[] args) {
		Comparable [] a = {2,10,6,4,5,7,10,13};
		sortThreePartition (a, 8);
		for (int i = 0; i <= 7 ; i++) {
			System.out.println(a[i]);
		}

	}
}
