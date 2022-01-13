class Solution {
    public int findNumbers(int[] nums) {
        int checker =0;
        for(int num : nums){
            if(countDigits(num) % 2 == 0) checker ++;
        }
        return checker;
    }
    
    int countDigits( int val){
        int count = 0;
        while(val > 0){
            val = val/10;
            count++;
        }
        return count;
    }
}