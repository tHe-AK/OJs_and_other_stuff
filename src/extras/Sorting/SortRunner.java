package extras.Sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortRunner {
    static BubbleSort bubbleSort = new BubbleSort(); // 1
    static SelectionSort selectionSort = new SelectionSort(); // 2
    static MergeSort mergeSort = new MergeSort() ; // 3

    static Map<Integer, Sorting> sortingAlgos=  new HashMap<Integer, Sorting>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        sortingAlgos.put(1, bubbleSort);
        sortingAlgos.put(2, selectionSort);
        sortingAlgos.put(3, mergeSort);

        int[] arr;
        System.out.print("Enter the size of array to sort: ");
        int size = scanner.nextInt();
        scanner.nextLine(); // moves the cursor to next line(skips to starting of next line)
        arr = new int[size];
        System.out.println("Enter the Elements of array: ");
        for(int i=0; i<size; i++)
            arr[i] = scanner.nextInt();
        int sortingAlgo = 1;
        System.out.println("Choose the Sorting Algo to use:\nBubble Sort : 1\nSelection Sort : 2\nMerge Sort : 3");
        int temp = scanner.nextInt();
        if(0<temp && temp < 4)
            sortingAlgo = temp;

        System.out.println("Sorting in Progress...");
        sortingAlgos.get(sortingAlgo).sort(arr); // Not very fond of the dependency resolution method i used. //TODO
    }


}
