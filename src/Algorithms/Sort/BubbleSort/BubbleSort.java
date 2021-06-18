package Algorithms.Sort.BubbleSort;

import Algorithms.Sort.SortingAlgorithm;

public class BubbleSort<T extends Comparable<T>> extends SortingAlgorithm<T> {
    @Override
    public void sort(T[] array) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if(array[j].compareTo(array[j+1]) > 0){
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Bubble sort";
    }
}
