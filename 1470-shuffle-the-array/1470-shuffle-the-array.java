class Solution {
    public int[] shuffle(int[] nums, int n) {
        int spointer= 0;
        int arr[] = new int[nums.length];
        for(int i = 0; i< nums.length / 2; i++){
            arr[spointer] = nums[i];
            spointer = spointer + 2;
        }
        
        int fpointer = 1;
        for(int i= nums.length /2; i < nums.length; i++){
            arr[fpointer] = nums[i];
           fpointer = fpointer + 2;
        }
        return arr;
    }
    
    //TC= O(N) SC= O(N)
}