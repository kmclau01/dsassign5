

public class QuickSort {

	public static void main(String[] args) {
		int[] array = {3,1,8,7,6,2,4,9,5};
		
		showArray(array);
		
	}
	
	public static void showArray(int[] theArray) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<theArray.length;index++) {
			if(index!=0) {
				System.out.printf(", ");
			}
			System.out.printf("%d",theArray[index]);
		}
		System.out.printf("]\n");
	}
	
	public static void quickSort(int[] array) {
		//**********************************************
		//*  Class Wrapper for the recursive quickSort *
		//**********************************************
		quickSort(array,0,array.length-1);
	}
	
	public static void quickSort(int[] array, int start, int end) {
		int pivot = array[end];
		int right = start;
		int left = right - 1;
		int swap;

		while(left<=right && right<end) {
			if(array[right]<=pivot) {
				left++;
				swap = array[left];
				array[left] = array[right];
				array[right] = swap;
			}
			right++;
			
		}
		left++;
		swap = array[left];
		array[left] = array[right];
		array[right] = swap;
		
		if(left<right) {
		quickSort(array,start,left-1);
		quickSort(array,left+1,right);
		}	
		
	}
	

}
