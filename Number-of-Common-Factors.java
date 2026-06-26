1class Solution {
2    public int commonFactors(int a, int b) {
3        int count = 0;
4        
5        // Find the smaller number to limit our loop
6        int min = Math.min(a, b);
7        
8        
9        // Loop from 1 up to the smaller number
10        for (int i = 1; i <= min; i++) {
11            // If 'i' divides BOTH a and b perfectly, it's a common factor
12            if (a % i == 0 && b % i == 0) {
13                count++;
14            }
15        }
16        
17        return count;
18    }
19}