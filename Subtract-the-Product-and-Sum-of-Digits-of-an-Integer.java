1class Solution {
2
3    public int subtractProductAndSum(int n) {
4        int prod = 1;
5        int sum = 0;
6        
7        while (n > 0) {
8            int lastDigit = n % 10;
9            
10            // Do both calculations together
11            sum = sum + lastDigit;
12            prod = prod * lastDigit;
13            
14            n = n / 10;
15        }
16        return prod - sum;
17    }
18}