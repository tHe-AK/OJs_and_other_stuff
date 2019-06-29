package extras.Sorting;
/*
   Selection Sort :
   Selects the smallest element, brings it to the front, marks it sorted.
 */
public class SelectionSort extends Sorting{

    @Override
    public void sort(int[] arrToSort) {
        int size = arrToSort.length;
        for(int i=0; i<size-1; i++){
            int smallestElementIndex =  i;

            for(int j=i+1; j<size; j++){
                if(arrToSort[j] < arrToSort[smallestElementIndex])
                    smallestElementIndex = j;
            }
            swapInPlace(smallestElementIndex, i, arrToSort);
            printIteration(arrToSort, i);
        }
        printSortedArray(arrToSort);
    }



}
