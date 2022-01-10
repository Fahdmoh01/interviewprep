class Solution {
    public int[] shuffle(int[] nums, int n) {
        int fskipper=0;
        int[] arr = new int[nums.length];
        for(int i =0; i<n; i ++){
            arr[fskipper] = nums[i];
            fskipper+=2;
        }
        
        int sskipper = 1;
        for(int i =n; i<nums.length; i ++){
            arr[sskipper] = nums[i];
            sskipper+=2;
        }
        
        return arr;
    }
}