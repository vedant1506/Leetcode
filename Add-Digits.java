1class Solution {
2    public int addDigits(int num) {
3        if(num % 10 == num) {
4            return num;
5        }
6       int sum = 0;
7        // Correctly sum ALL digits of the number
8        while (num > 0) {
9            sum += num % 10;
10            num = num / 10;
11        }
12        return addDigits(sum);
13    }
14    
15}