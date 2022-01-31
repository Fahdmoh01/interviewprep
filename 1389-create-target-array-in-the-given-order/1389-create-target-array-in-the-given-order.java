class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int t[] = new int[nums.length];
        Arrays.fill(t, -1);
        
        for(int i = 0; i< nums.length; i++){
            if(t[index[i]] != -1){
               shift(index[i], t);
               t[index[i]]= nums[i];
            }else{
                t[index[i]]= nums[i];    
            }
            
        }
        return t;
    }
    
    void shift(int pos, int arr[]){
        for(int i = arr.length - 1; i>pos; i--){
            arr[i] = arr[i - 1];
        }
    }
}