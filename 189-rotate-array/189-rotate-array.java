class Solution {
    public void rotate(int[] nums, int k) {
        
        //step to move by doing this catches the edge case.
        k = k % nums.length;
        
        finalreverse(nums,0, nums.length - 1);
        finalreverse(nums, 0, k - 1);
        finalreverse(nums, k,nums.length - 1);
    }
    
    void finalreverse(int arr[], int start, int end){
        while(start <= end){
            int temp = arr[ start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }    
    }
}