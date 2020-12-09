package sortingAlgorithms;

public class InsertionSort {

	public static int[] createArray(int N){
		int[] array = new int[N];
		for(int i = 0; i < N; i++) {
			array[i] = (int)(Math.random()*N);
		}
		return array;
	}
	public static void printArray(int[] tab) {
		for(int v: tab) {
			System.out.print(v + " ");
		}
	}
	public static int[] sortArray(int[] tab) {
		System.out.println("");
		int pos;
		do {
			pos = findNextLowestPos(tab);
			swapTab(tab,lowestFromSortedPos(tab,pos),findNextLowestPos(tab));
			
		}while(pos != -1);
		printArray(tab);
		return tab;
	}
	
	//finds first not sorted number
	public static int findNextLowestPos(int[] tab) {
		for(int i = 0; i < tab.length-1; i++) {
			if(tab[i] > tab[i+1]) {
				return i+1;
			}
		}
		return -1; //returns -1 if sorted
	}
	//finds lowest pos from sorted table
	public static int lowestFromSortedPos(int[] tab, int n) {
		for(int i = 0; i < n; i++) {
			if(tab[i] > tab[n]) {
				return i;
			}
		}
		return -1;
	}
	public static int[] swapTab(int[] tab, int first, int last) {
		int helpVar = 0;
		int[] newTab = tab;
		for(int i = first; i < last; i++) {
			helpVar = tab[last];
			tab[last] = tab[i];
			tab[i] = helpVar;
		}
		return newTab;
	}
	
	public static void main(String[] args) {
		
		int[] intArray = createArray(100);
		printArray(intArray);
		
		sortArray(intArray);
	}
}
