package extras.Sorting;

public abstract class Sorting {

    abstract void sort(int[] arrToSort);

    public void printSortedArray(int[] sortedArray){
        System.out.println("Sorted array :");
        for(int i=0; i<sortedArray.length; i++)
            System.out.print(((Integer)sortedArray[i]).toString() + " ");
        System.out.print("\n");
    }

    public void printIteration(int[] arr, int iterationNum){
        System.out.print("Array at iteration number "+  ((Integer)iterationNum).toString() + ": ");
        for(int i=0; i<arr.length; i++)
            System.out.print(((Integer)arr[i]).toString() + " ");
        System.out.print("\n");
    }

    public void swap(int elementIndex, int effectivePosition, int[] arr){ // swap using a third temp variable
        int temp = arr[elementIndex];
        arr[elementIndex] = arr[effectivePosition];
        arr[effectivePosition] = temp;
    }

    /*swap without using a third temp variable.
        a = a + b; a now has sum of the two.
        b = a - b; sum minus the earlier value of b will give earlier value of a(new value of b).
        a = a - b; sum minus the new value of b(earlier value of a) will give the earlier value of b(new value of a).
    */
    public void swapInPlace(int elementIndex, int effectivePosition, int[] arr){
        if(elementIndex == effectivePosition)
            return;
        arr[elementIndex] =  arr[elementIndex] + arr[effectivePosition];
        arr[effectivePosition] = arr[elementIndex] - arr[effectivePosition];
        arr[elementIndex] = arr[elementIndex]  -  arr[effectivePosition];
    }
}
