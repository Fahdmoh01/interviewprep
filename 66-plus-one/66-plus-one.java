class Solution {
    public int[] plusOne(int[] digits) {
        int new_digits[] = new int [digits.length + 1];
        int sum =0;  
      
    boolean results = checkAll(digits);
        if(results){
            new_digits[0]=1;
            return new_digits;
        }
        
        for(int i =digits.length - 1; i>=0 ; i--){
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        
        return digits;
        
    }
    
    boolean checkAll(int arr[]){
          for(int i =0; i< arr.length; i++){
            if(arr[i] != 9){
               return false;
            }
        }
        return true;
    }
}