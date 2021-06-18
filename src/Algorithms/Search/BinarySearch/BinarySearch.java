package Algorithms.Search.BinarySearch;

public class BinarySearch {

    public static int find(int[] array, int target) {
        return binarySeaarch(array, target, 0, array.length-1);
    }

    public static int binarySeaarch(int[] array, int target, int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (array[mid] == target) {
            return mid;
        }
        else if(array[mid] > target) {
            return binarySeaarch(array, target, low, mid-1);
        }
        else {
            return binarySeaarch(array, target, mid+1, high);
        }
    }
}
