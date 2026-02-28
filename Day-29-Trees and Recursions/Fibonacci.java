// Day 29 - Recursion Basics
// Program: Fibonacci using Recursion

public class Fibonacci {

    // Recursive function to find nth Fibonacci number
    static int fibonacci(int n) {
        // Base case
        if (n <= 1)
            return n;

        // Recursive calls
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;

        System.out.println("Fibonacci series up to " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
