package sortingAlgorithms;

public class SelectionSort {

	public static int[] createArray(int N) {
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = (int) (Math.random() * N);
		}
		return array;
	}

	public static void printArray(int[] tab) {
		for (int v : tab) {
			System.out.print(v + " ");
		}
	}

	public static int findMin(int[] tab, int limit) {
		int min = limit;
		for (int i = limit; i < tab.length; i++) {
			if (tab[min] > tab[i]) {
				min = i;
			}
		}
		return min;
	}

	public static boolean isSorted(int[] tab) {
		for (int i = 0; i < tab.length - 1; i++) {
			if (!(tab[i] < tab[i + 1])) {
				return false;
			}
		}
		return true;
	}

	public static int[] swapPlace(int[] tab, int first, int last) {
		int helpVar;
		helpVar = tab[last];
		tab[last] = tab[first];
		tab[first] = helpVar;
		return tab;
	}

	public static int[] sortArray(int[] tab) {

		int isSorted = 0;

		while (isSorted(tab) || isSorted < tab.length) {
			if (findMin(tab, isSorted) != isSorted) {
				tab = swapPlace(tab, isSorted, findMin(tab, isSorted));
			}
			isSorted++;
		}
		return tab;
	}

	public static void main(String[] args) {

		int[] array = createArray(10);
		printArray(array);
		System.out.println("");
		array = sortArray(array);
		printArray(array);

	}

}
