class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList <Boolean> list = new ArrayList<>();
    //loop through array and find the maximum element.
        int max = Integer.MIN_VALUE;
        for( int candy: candies){
            max= Math.max(candy, max);
        }
    //add the extraCandies to the elements and compare with the maximum
        for(int candy: candies){
            if(candy + extraCandies >= max){
                list.add(Boolean.TRUE);
            }else{
                list.add(Boolean.FALSE);
            }
        }
        
        return list;
        
//         for(int i = 0; i < candies.length; i++){
//             int temp = candies[i];
//             candies[i]= candies[i] + extraCandies;
//             int max = findMax(candies);
//             if(candies[i] == max){
//                 list.add(Boolean.TRUE);
//             }else{
//                 list.add(Boolean.FALSE);
//             }
//             candies[i]= temp;
//         }
//         return list;
//     }
    
    // int findMax(int arr[]){
    //  int maxNum = Integer.MIN_VALUE;
    //     for(int i =0; i < arr.length; i++){
    //         if(arr[i] >maxNum){
    //             maxNum = arr[i];
    //         }
    //     }
    //     return maxNum;
    }
}