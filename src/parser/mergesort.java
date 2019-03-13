package parser;

public class mergesort {
	private static CrimeADT[] aux;
	
	private static void merge(CrimeADT[] arr, int low, int middle, int high, char type) {
		
		int left = low, right = middle + 1;
		for (int i = low; i <= high; i++) {
			aux[i] = arr[i];
		}

		for (int i = low; i <= high; i++) {
			if (left > middle)
				arr[i] = aux[right++];
			else if (right > high)
				arr[i] = aux[left++];
			else if (type == 'I' && aux[right].compareId(aux[left]) < 0)
				arr[i] = aux[right++];
			else if (type == 'O' && aux[right].compareOffence(aux[left]) < 0)
				arr[i] = aux[right++];
			else if (type == 'R' && aux[right].compareResidence(aux[left]) < 0)
				arr[i] = aux[right++];
			else
				arr[i] = aux[left++];
		}
	}
	// i = size
	public static void sortId(CrimeADT[] x, int n) {
		aux = new CrimeADT[n];
		for (int i = 1; i < n; i = i + i)
			for (int low = 0; low < n - i; low += i + i)
				merge(x, low, low + i - 1, Math.min(low + i + i - 1, n - 1), 'I');
	}
	
	public static void sortOffence(CrimeADT[] x, int n) {
		aux = new CrimeADT[n];
		for (int i = 1; i < n; i = i + i)
			for (int low = 0; low < n - i; low += i + i)
				merge(x, low, low + i - 1, Math.min(low + i + i - 1, n - 1), 'O');
	}
	
	public static void sortResidence(CrimeADT[] x, int n) {
		aux = new CrimeADT[n];
		for (int i = 1; i < n; i = i + i)
			for (int low = 0; low < n - i; low += i + i)
				merge(x, low, low + i - 1, Math.min(low + i + i - 1, n - 1), 'R');
	}

}
