package Algorithms.Search.BinarySearch;

public class Program {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,7,8};

        System.out.println(BinarySearch.find(array, 1));
        System.out.println(BinarySearch.find(array, 8));
        System.out.println(BinarySearch.find(array, 3));
        System.out.println(BinarySearch.find(array, 5)); //doesn't exist, return -1
    }
}
