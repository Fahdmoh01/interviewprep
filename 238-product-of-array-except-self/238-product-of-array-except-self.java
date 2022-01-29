class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
        int mul = 1;
        //start from begining, multiply elements that comes before cuurent element and store in array.
        for(int i = 0; i< nums.length; i++){
            arr[i] = mul;
            mul *= nums[i];
        }
        
        //start from ending, multiply elements that comes before current element and store in array.
        mul =1;
        for(int i = nums.length - 1; i>=0; i--){
            arr[i] *= mul;
            mul *= nums[i];
        }
    return arr;
    }
    
    //TC= O(N) SC = O(N)
}