package backjun_study;

public class Selectsort {
	
	public static void swapElements(int[] array, int i, int j) {
		int temp = array[j];
		array[i] = array[j];
		array[j] = temp;
	}
	
	
	public static int indexLowest(int[] array, int start) {
		int lowIndex = start;
		for(int i = start; i<array.length; i++) {
			if(array[i] < array[lowIndex]) lowIndex = i;
		}
		return lowIndex;		
	}
	
	
	public static void selectionSort(int[] array) {
		for(int i=0; i<array.length; i++) {
			int j = indexLowest(array, i);
			swapElements(array, i, j);
		}
		
		
	}
	public static void main(String[] args) {
	

	}

}
