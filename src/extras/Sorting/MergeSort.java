package extras.Sorting;
/*
    Merge Sort:
    Divide the given data set in half until you reach a unit that in itself is sorted(can't be divided further),and start merging them back,
    keeping in mind that the two halves that you have are already sorted. 
 */
public class MergeSort extends Sorting{
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
    
    //out of place merging, less time Complexity : O(n.log(n))
    private void merge(int[] arr, int startIndex, int middle, int lastIndex) {
    	int sizeLeft = middle+1-startIndex;  
    	int sizeRight = lastIndex+1 - (middle+1);
    	
    	int[] leftArray = new int[sizeLeft];
    	int[] rightArray = new int[sizeRight];
    	
    	for(int i = 0; i < sizeLeft; i++)
    		leftArray[i] = arr[startIndex + i];
    	for(int i = 0; i < sizeRight; i++)
    		rightArray[i] = arr[middle+1 + i];
    	
    	int i = startIndex; // counter for the main array.
    	int l = 0; // counter for the left array.
    	int r = 0; // counter for the right array.
    	
    	while(l < sizeLeft && r < sizeRight ){  // will take care of number of elements in the smaller of the two(left or right)
    		if(leftArray[l]<=rightArray[r]) {
    			arr[i] = leftArray[l];
    			l++;
    		}
    		else {
    			arr[i] = rightArray[r];
    			r++;
    		}
    		i++;
    	}
    	
    	while(l < sizeLeft) {  // If left array is greater than the right.
    		arr[i] = leftArray[l];
    		l++;
    		i++;
    	}
    	while(r < sizeRight) { // if right array is greater than the left.
    		arr[i] = rightArray[r];
    		r++;
    		i++;
    	}
    }
    
}
