1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        // Create the result array of size 2n
4        int[] ans = new int[2 * n];
5        
6        // Loop through the first half of the array
7        for (int i = 0; i < n; i++) {
8            // Place the x element at the even position
9            ans[2 * i] = nums[i];
10            
11            // Place the corresponding y element at the odd position
12            ans[2 * i + 1] = nums[i + n];
13        }
14        
15        return ans;
16    }
17}