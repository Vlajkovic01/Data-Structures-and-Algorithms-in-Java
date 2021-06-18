package SortingAlgorithms;

import java.util.Random;

public class QuickSort<T extends Comparable<T>> extends SortingAlgorithm<T>{
    @Override
    public void sort(T[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(T[] array, int low, int high){
        if (low < high) {

            int pi = randomizedPartition(array, low, high);
            sort(array, low, pi - 1);
            sort(array, pi + 1, high);
        }
    }

    private int randomizedPartition(T[] array, int low, int high){
        Random rnd = new Random();
        int index = rnd.nextInt(high - low) + low;
        T temp = array[index];
        array[index] = array[high];
        array[high] = temp;
        return partition(array, low, high);
    }


    private int partition(T[] array, int low, int high) {
        T pivot = array[high];

        int left = low;
        int right = high - 1;

        while (left <= right){

            while (left <= right && array[left].compareTo(pivot) < 0){
                left++;
            }

            while (left <= right && array[right].compareTo(pivot) > 0){
                right--;
            }

            if(left <= right){
                swap(array, left, right);
                left++;
                right--;
            }
        }

        swap(array, left, high);

        return left;
    }

    private void swap(T[] arr, int i, int j)
    {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Override
    public String toString() {
        return "Quick sort";
    }
}