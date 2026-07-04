class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // Run until the two pointers meet in the middle
        while (left < right) {
            // If the left number is odd and right number is even, swap them!
            if (nums[left] % 2 != 0 && nums[right] % 2 == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                
                left++;
                right--;
            } 
            // If left is already even, it's in the correct half. Move forward.
            else if (nums[left] % 2 == 0) {
                left++;
            } 
            // If right is already odd, it's in the correct half. Move backward.
            else if (nums[right] % 2 != 0) {
                right--;
            }
        }
        
        return nums;
    }
}