class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff=-1;
        int currDiff=0;
        for(int i =0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(i<j && nums[j] > nums[i]) {
                    currDiff = nums[j] - nums[i];
                    if(currDiff > maxDiff) {
                        maxDiff = currDiff;
                    }
                }
            }
        }
        return maxDiff;
    }
}