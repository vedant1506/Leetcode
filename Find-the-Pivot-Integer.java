1class Solution {
2    public int pivotInteger(int n) {
3        // 1. Calculate the total sum of numbers from 1 to n
4        int totalSum = 0;
5        for (int i = 1; i <= n; i++) {
6            totalSum += i;
7        }
8
9        int leftSum = 0;
10
11        // 2. Iterate through and check each number as a possible pivot
12        for (int i = 1; i <= n; i++) {
13            leftSum += i; // Update the sum from 1 to i
14            
15            // Calculate the right sum from i to n using our total sum
16            int rightSum = totalSum - leftSum + i;
17
18            // If they are equal, we found our pivot!
19            if (leftSum == rightSum) {
20                return i;
21            }
22        }
23
24        // If no such integer exists
25        return -1;
26    }
27}