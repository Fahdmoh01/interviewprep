class Solution {
    public int maxSubArray(int[] nums) {
        //Applying Kadane's Algorithm
        int maxSum = nums[0];
        int currentSum = maxSum;
        for(int i = 1; i < nums.length; i++){
            currentSum = Math.max(nums[i]+currentSum, nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}