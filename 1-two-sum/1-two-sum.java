class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i =0; i< nums.length; i++){
            int checker = target - nums[i];
            if(hm.containsKey(checker)){
                int indexB = hm.get(checker);
                return new int[]{i, indexB};
            }else{
                hm.put(nums[i], i);
            }
        }
        return new int[]{-1,-1};
    }
}