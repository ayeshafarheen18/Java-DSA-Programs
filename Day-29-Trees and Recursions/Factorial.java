// Day 29 - Recursion Basics
// Program: Factorial using Recursion

public class Factorial {

    // Recursive function to find factorial
    static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1)
            return 1;

        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;

        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
