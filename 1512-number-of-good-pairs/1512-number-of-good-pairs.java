class Solution {
    public int numIdenticalPairs(int[] nums) {
        // int count = 0;
        // for(int i = 0; i< nums.length - 1; i++){
        //     for(int j = i + 1; j< nums.length; j++){
        //         if(nums[i] == nums[j]) count++;
        //     }
        // }
        // return count;
        
        //using a hashmap
        HashMap<Integer, Integer> hm = new HashMap<>();
         int count = 0;
        for(int num: nums){
            if(hm.containsKey(num)){
                count += hm.get(num);
                hm.put(num, hm.get(num) + 1);
            }else{
                hm.put(num, 1);
            }
        }
            
        return count;
        
    }
}