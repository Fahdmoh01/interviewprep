class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList <Boolean> list = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            int temp = candies[i];
            candies[i]= candies[i] + extraCandies;
            int max = findMax(candies);
            if(candies[i] == max){
                list.add(Boolean.TRUE);
            }else{
                list.add(Boolean.FALSE);
            }
            candies[i]= temp;
        }
        return list;
    }
    
    int findMax(int arr[]){
     int maxNum = Integer.MIN_VALUE;
        for(int i =0; i < arr.length; i++){
            if(arr[i] >maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
}