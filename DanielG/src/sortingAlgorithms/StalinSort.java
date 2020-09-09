package sortingAlgorithms;

public class StalinSort {
	
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

	// Formats array in console for reader
	public static void formatArray(int[] table) {

		int counter = 0;
		
		for (int v : table) {
			System.out.print(v + " ");
			counter++;
			if (counter == 10) {
				System.out.println("");
				counter = 0;
			}
		}
	}

	// stalinSort()
	// Removes any numbers out of order
	public static void stalinSort(int[] table) {
		
		int sortVal = 0;
		
		for (int i = 0; i < table.length; i++) {
			if (table[i] > sortVal) {
				sortVal = table[i];
			} else {
				table[i] = 0;
			}
		}
	}

	// Prints stalinSort(), removes 0 from print
	public static void stalinPrint(int[] table) {
		
		System.out.println("Sorted array: ");
		
		for (int v : table) {
			if (v != 0) {
				System.out.print(v + " ");
			}
		}
	}

	public static void main(String[] args) {
		int length = 100;
		int[] newArray;
		newArray = new int[length];
		
		fillArray(newArray);

		formatArray(newArray);

		stalinSort(newArray);
		stalinPrint(newArray);
	}

}
