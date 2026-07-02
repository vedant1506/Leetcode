class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];
        
        // Loop through each element we want to insert
        for (int i = 0; i < n; i++) {
            int targetIdx = index[i];
            int value = nums[i];
            
            // Shift elements to the right to make room
            // We start from 'i' (the current filled boundary) and push items forward
            for (int j = i; j > targetIdx; j--) {
                target[j] = target[j - 1];
            }
            
            // Now that space is clear, insert the value
            target[targetIdx] = value;
        }
        
        return target;
    }
}