package Algorithms.Sort.MergeSort;

import Algorithms.Sort.SortingAlgorithm;
import DataStructures.ArrayList.ArrayList; //this is mine array, change to your array list or java array

public class MergeSort<T extends Comparable<T>> extends SortingAlgorithm<T> {
    @Override
    public void sort(T[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(T[] array, int low, int high){
        if (low < high){
            int mid = (low+high)/2;

            sort(array, low, mid);
            sort(array, mid+1, high);

            merge(array, low, mid, high);
        }
    }

    private void merge(T[] array, int low, int mid, int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;

        ArrayList<T> leftArray = new ArrayList<T>();
        ArrayList<T> rightArray = new ArrayList<T>();

        for (int i = 0; i < n1; i++) {
            leftArray.add(array[low + i]);
        }

        for (int i = 0; i < n2; i++) {
            rightArray.add(array[mid + 1 + i]);
        }

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2){
            if(leftArray.get(i).compareTo(rightArray.get(j)) < 0){
                array[k] = leftArray.get(i);
                i++;
            }else{
                array[k] = rightArray.get(j);
                j++;
            }

            k++;
        }

        while (i < n1){
            array[k] = leftArray.get(i);
            i++;
            k++;
        }

        while (j < n2){
            array[k] = rightArray.get(j);
            j++;
            k++;
        }
    }

    @Override
    public String toString() {
        return "Merge sort";
    }
}
