package parser;

public class Search {

	static int searchId(CrimeADT[] arr, String x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			int res = x.compareTo(arr[m].getId());
			if (res == 0)
				return m;
			if (res > 0)
				l = m + 1;
			else
				r = m - 1;
		}
		return -1;
	}

	static int searchOffence(CrimeADT[] arr, String x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			int res = x.compareTo(arr[m].getOffence());

			// Check if x is present at mid
			if (res == 0)
				return m;
			// If x greater, ignore left half
			if (res > 0)
				l = m + 1;
			// If x is smaller, ignore right half
			else
				r = m - 1;
		}
		return -1;
	}

	static int searchResidence(CrimeADT[] arr, String x) {
		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;

			int res = x.compareTo(arr[m].getResidence());

			// Check if x is present at mid
			if (res == 0)
				return m;
			// If x greater, ignore left half
			if (res > 0)
				l = m + 1;
			// If x is smaller, ignore right half
			else
				r = m - 1;
		}
		return -1;
	}

	static int searchLongitude(CrimeADT arr[], int l, int r, double d) {

		if (r >= l) {
			int mid = l + (r - l) / 2;

			// If the element is present at the
			// middle itself
			if (arr[mid].getLongitude() == d)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid].getLongitude() > d)
				return searchLongitude(arr, l, mid - 1, d);

			// Else the element can only be present
			// in right subarray
			return searchLongitude(arr, mid + 1, r, d);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}
	
	static int searchLatitude(CrimeADT arr[], int l, int r, double d) {

		if (r >= l) {
			int mid = l + (r - l) / 2;

			// If the element is present at the
			// middle itself
			if (arr[mid].getLatitude() == d)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid].getLatitude() > d)
				return searchLatitude(arr, l, mid - 1, d);

			// Else the element can only be present
			// in right subarray
			return searchLatitude(arr, mid + 1, r, d);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

}
