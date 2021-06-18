package SortingAlgorithms;

import java.util.Random;

public class Program {

    public static void testAlgorithm(SortingAlgorithm<Integer> algorithm, Integer[] array){
        long start = System.nanoTime();
        algorithm.sort(array);
        long end = System.nanoTime();

        System.out.println("Algorithm " + algorithm.toString() + " finished in " + ((end - start)/1e9) + " seconds");
    }

    public static void testAlgorithms(Integer[] array) {
        Integer[] array1 = new Integer[array.length];
        Integer[] array2 = new Integer[array.length];
        Integer[] array3 = new Integer[array.length];
        Integer[] array4 = new Integer[array.length];

        System.arraycopy(array, 0, array1, 0, array1.length);
        System.arraycopy(array, 0, array2, 0, array2.length);
        System.arraycopy(array, 0, array3, 0, array3.length);
        System.arraycopy(array, 0, array4, 0, array4.length);

        testAlgorithm(new InsertionSort<>(), array);
        testAlgorithm(new SelectionSort<>(), array1);
        testAlgorithm(new BubbleSort<>(), array2);
        testAlgorithm(new MergeSort<>(), array3);
        testAlgorithm(new QuickSort<>(), array4);

        System.out.println("Array is sorted after Insertion sort? " + isSorted(array, true));
        System.out.println("Array is sorted after Selection sort? " + isSorted(array1, true));
        System.out.println("Array is sorted after Bubble sort? " + isSorted(array2, true));
        System.out.println("Array is sorted after Merge sort? " + isSorted(array3, true));
        System.out.println("Array is sorted after Quick sort? " + isSorted(array4, true));
    }

    public static void testMergeAndQuick(Integer[] array){
        Integer[] arrayCopy = new Integer[array.length];
        System.arraycopy(array, 0, arrayCopy, 0, arrayCopy.length);
        testAlgorithm(new MergeSort<>(), arrayCopy);
        testAlgorithm(new QuickSort<>(), array);
    }

    public static Integer[] createIntArray(int length){
        Random rnd = new Random();
        Integer[] array = new Integer[length];

        for (int i = 0; i < length; i++) {
            array[i] = rnd.nextInt(length);
        };

        return array;
    }

    public static boolean isSorted(Integer[] array, boolean ascending){
        for (int i = 0; i < array.length - 1; i++) {
            if(ascending && array[i] > array[i+1]){
                return false;
            }
            else if (!ascending && array[i] < array[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] array1K = createIntArray(1000);
        Integer[] array10K = createIntArray(10000);
        Integer[] array100K = createIntArray(100000);
        Integer[] array1M = createIntArray(1000000);

        System.out.println("################# Testing 1K elements ##################");
        testAlgorithms(array1K);
        System.out.println("########################################################");

        System.out.println("################# Testing 10K elements #################");
        testAlgorithms(array10K);
        System.out.println("########################################################");

        System.out.println("################ Testing 100K elements #################");
        testAlgorithms(array100K);
        System.out.println("########################################################");

        System.out.println("################## Testing 1M elements #################");
        testMergeAndQuick(array1M);
        System.out.println("########################################################");
    }
}
