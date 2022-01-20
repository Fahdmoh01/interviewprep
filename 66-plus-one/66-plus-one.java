class Solution {
    public int[] plusOne(int[] digits) {
        int new_digits[] = new int [digits.length + 1];
        int sum =0;            
        
        for(int i =digits.length - 1; i>=0 ; i--){
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        //if no return statement it means all the values in the array are nine;
        new_digits[0]=1;
        return new_digits;
      
        
    }
    
}