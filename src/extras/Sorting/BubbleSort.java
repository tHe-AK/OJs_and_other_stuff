package extras.Sorting;
/*
    Bubble Sort:
    bubbles the largest element to the end, and marks it sorted.
 */
public class BubbleSort extends Sorting{

    @Override
    public void sort(int[] arrToSort) {
        int size = arrToSort.length;

        for(int i=size-1; i>0; i--){ // loop ends at the start of sorted list(initially empty), with each iteration one element from the end added to the sorted list.
            int largestElementIndex = i;

            for(int j=i-1; j >=0; j--) { // starting from i+1, next element to already selected largestElement.
                if (arrToSort[j] > arrToSort[largestElementIndex])
                    largestElementIndex = j;
            }
            swap(largestElementIndex, i, arrToSort); // swap the largest with the end of the current unsorted list.
            printIteration(arrToSort, Math.abs(i+1-size));
        }
        printSortedArray(arrToSort);
    }



}
