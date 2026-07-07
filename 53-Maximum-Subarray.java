class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize max to rock bottom so it works even with all-negative arrays
        int maxSum = Integer.MIN_VALUE; 
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // Add the current element to our running streak
            currentSum += nums[i];
            
            // If our running streak just broke a record, save it!
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            
            // If our streak drops below 0, it becomes a liability. Reset it!
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        return maxSum;
    }
}