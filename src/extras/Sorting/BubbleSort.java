package extras.Sorting;
/*
    Bubble Sort:
    Bubbles the largest element to the end by continuously swapping each adjacent element pair if not in order.
 */
public class BubbleSort extends Sorting{

    @Override
    public void sort(int[] arrToSort) {
        int size = arrToSort.length;

        for(int i=0; i<size; i++){
            for(int j=0; j < size-i-1; j++) { 
                if (arrToSort[j] > arrToSort[j+1])
                	swap(j+1, j, arrToSort); // swap elements if not in correct order.
            }
            printIteration(arrToSort, i);
        }
        printSortedArray(arrToSort);
    }



}
