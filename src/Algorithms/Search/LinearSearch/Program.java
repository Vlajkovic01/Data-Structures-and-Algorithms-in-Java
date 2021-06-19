package Algorithms.Search.LinearSearch;

public class Program {

    public static void main(String[] args) {
        int[] array = {1,3,5,7,9};

        int result = LinearSearch.search(array, 5);

        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index: " + result);
        }
    }
}
