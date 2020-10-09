package sortingAlgorithms;

public class BubbleSort {

	// Fills array with numbers from 0 to 100
	public static void fillArray(int[] table) {

		boolean lik = false;

		for (int i = 0; i < table.length; i++) {

			int tilfeldig = (int) (Math.random() * 101);

			for (int v : table) {
				if (v == tilfeldig) {
					lik = true;
				}
			}
			if (lik == false) {
				table[i] = tilfeldig;
			} else {
				i--;
			}
			lik = false;
		}
	}

	// Sorts array
	public static void sort(int[] table) {
		int holder;
		for (int i = 0; i < table.length - 1; i++) {
			if (table[i] > table[i + 1]) {

				holder = table[i];
				table[i] = table[i + 1];
				table[i + 1] = holder;
			}
		}
	}

	// Checks if array is sorted
	public static boolean checkArray(int[] table) {
		boolean isSorted = true;
		for (int i = 0; i < table.length - 1; i++) {
			if (table[i] > table[i + 1]) {
				isSorted = false;
				break;
			}
		}
		return isSorted;
	}

	public static void main(String[] args) {
		int lenght = 100;
		int[] newArray;
		newArray = new int[lenght];

		fillArray(newArray);

		for (int v : newArray) {
			System.out.print(v + " ");
		}
		System.out.println("");

		while (!(checkArray(newArray))) {
			sort(newArray);
		}
		for (int v : newArray) {
			System.out.print(v + " ");
		}
	}
}