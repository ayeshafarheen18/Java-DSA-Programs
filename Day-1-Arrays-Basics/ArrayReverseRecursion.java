import java.util.Arrays;
public class ArrayReverseRecursion { 
// Recursive function to reverse the array
public static void reverse(int[] arr, int start, int end) { 
// Base condition 
if (start >= end) return; 
// Swap elements 
int temp = arr[start]; 
arr[start] = arr[end]; 
arr[end] = temp; 
// Recursive call 
reverse(arr, start + 1, end - 1);
} 
public static void main(String[] args) {
// Sample array 
int[] arr = {10, 20, 30, 40, 50, 60};
System.out.println("Original Array: " + Arrays.toString(arr));
// Call recursive reverse function
reverse(arr, 0, arr.length - 1); 
System.out.println("Reversed Array: " + Arrays.toString(arr)); 
   } 
}
