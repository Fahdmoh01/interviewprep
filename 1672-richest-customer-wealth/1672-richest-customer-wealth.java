class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int maxGuide = Integer.MIN_VALUE;
        for(int row=0; row<accounts.length; row++){
             max = sumValue(accounts[row]);
                
                if(max > maxGuide){
                    maxGuide = max;
                }
        }
        
        return maxGuide;  
        
    }
    
    int sumValue(int[] arr){
            int sum = 0;
            for(int num: arr){
                sum+= num;
            }
            return sum;
    }
}