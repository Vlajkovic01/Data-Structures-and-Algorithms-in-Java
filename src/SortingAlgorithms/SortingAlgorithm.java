package SortingAlgorithms;

public abstract class SortingAlgorithm<T extends Comparable<T>> {
    public abstract void sort(T[] array);
}
