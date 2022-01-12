class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        //put element at index. if there is an elements shift all elements to the right and insert
        int arr[] = new int [nums.length];
        for(int i=0; i< arr.length; i++){
            arr[i] = -1;
        }
        
        for(int i =0; i < arr.length; i++){
            if(arr[index[i]] == -1){
                arr[index[i]] = nums[i];
            }else{
                performShift(arr, index[i]);
                arr[index[i]] = nums[i];

            }
        }
        
        return arr;
    }
    
    void performShift(int arr[], int pos){
        for(int i = arr.length - 1; i > pos; i--){
            arr[i] = arr[i - 1];
        }
    }
}