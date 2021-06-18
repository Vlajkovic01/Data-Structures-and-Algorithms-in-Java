package Algorithms.Sort.SelectionSort;

import Algorithms.Sort.SortingAlgorithm;

public class SelectionSort<T extends Comparable<T>> extends SortingAlgorithm<T> {
    @Override
    public void sort(T[] array) {
        int size = array.length;

        for(int step = 0; step < size - 1; step++){
            int min_idx = step;

            for(int i = step + 1; i < size; i++){
                if (array[i].compareTo(array[min_idx]) < 0){
                    min_idx = i;
                }
            }

            T temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
    }

    @Override
    public String toString() {
        return "Selection sort";
    }
}