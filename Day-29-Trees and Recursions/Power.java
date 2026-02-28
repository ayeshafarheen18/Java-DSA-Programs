// Day 29 - Recursion Basics
// Program: Power of a Number using Recursion

public class Power {

    // Recursive function to calculate power
    static int power(int base, int exp) {
        // Base case
        if (exp == 0)
            return 1;

        // Recursive call
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;

        int result = power(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }
}
