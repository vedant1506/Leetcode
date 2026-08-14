class Solution {
    public double myPow(double x, int n) {
        long N = n; // Convert to long to safely handle Integer.MIN_VALUE negation
        
        // Handle negative exponent
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return power(x, N);
    }

    private double power(double x, long n) {
        // Base Case: any number to the power of 0 is 1
        if (n == 0) {
            return 1.0;
        }

        // Divide step: compute x^(n/2) once
        double half = power(x, n / 2);

        // If n is even: half * half
        if (n % 2 == 0) {
            return half * half;
        } 
        // If n is odd: half * half * x
        else {
            return half * half * x;
        }
    }
}