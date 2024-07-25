package binarysearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[] myArray = { 1, 3, 5, 7, 9 };

        System.out.println(binarySearch(myArray, 3)); // 1
        System.out.println(binarySearch(myArray, -1)); // -1 (instead of None)
    }

    public static int binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2; // Calculate the middle index
            int guess = list[mid]; // Guess the middle element

            if (guess == item) {
                return mid; // Item found, return its index
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; // Item not found, return -1
    }

}
