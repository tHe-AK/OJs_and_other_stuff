package extras.Sorting;

public class MergeSortInPlace extends Sorting{

  @Override
    public void sort(int[] arrToSort) {
    	int size = arrToSort.length;
    	mergeSort(arrToSort, 0, size-1);
    	printSortedArray(arrToSort);
    }
    
    private void mergeSort(int[] arr, int startIndex, int lastIndex) {
    	if(startIndex < lastIndex) {
    		int middle = (startIndex + lastIndex)/2;
    		mergeSort(arr, startIndex, middle);
    		mergeSort(arr, middle + 1, lastIndex);
    		merge(arr, startIndex, middle, lastIndex);
    	}
    }
    
    // In-place merging w/o using extra array, time complexity O( n^2.log(n) )
    private void merge(int[] arr, int startIndex, int middle, int lastIndex) {
    	int leftSize  = (middle - startIndex) + 1 ;
    	int rightSize = (lastIndex - (middle+1)) + 1;
    	
    	//TODO
    }

}
