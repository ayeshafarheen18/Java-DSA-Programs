import java.util.Arrays;

/**
 * Program to find the second largest element in an array.
 */
public class SecondLargestElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        // Check for minimum required elements
        if (arr == null || arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array once
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements may be equal).");
        } else {
            System.out.println("Array Elements  : " + Arrays.toString(arr));
            System.out.println("Second Largest  : " + secondLargest);
        }
    }
}
