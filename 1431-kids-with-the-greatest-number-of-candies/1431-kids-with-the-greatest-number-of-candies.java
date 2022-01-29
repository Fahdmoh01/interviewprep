class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> indicator = new ArrayList<>();
        int max = Integer.MIN_VALUE;        
        for(int num: candies){
            max= Math.max(max, num);
        }
        
        for(int num: candies){
            if(num + extraCandies >= max){
                indicator.add(Boolean.TRUE);
            }else{
                indicator.add(Boolean.FALSE);
            }
        }
        
        return indicator;
    }
    //UMPIRE: TC = O(n) SC:O(n)
}