package Algorithms.SortingAlgorithms;

public class InsertionSort<T extends Comparable<T>> extends SortingAlgorithm<T> {
    @Override
    public void sort(T[] array) {
        int size = array.length;

        for (int step = 1; step < size; step++){
            T key = array[step];
            int j = step - 1;

            while (j >= 0 && key.compareTo(array[j]) < 0){
                array[j+1] = array[j];
                --j;
            }

            array[j+1] = key;
        }
    }

    @Override
    public String toString() {
        return "Insertion sort";
    }
}
