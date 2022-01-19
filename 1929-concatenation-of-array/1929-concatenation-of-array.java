class Solution {
    public int[] getConcatenation(int[] nums) {
        int n_nums[] = new int[ 2 * nums.length];
        for(int i=0; i< nums.length; i++){
            n_nums[i] =nums[i];
        }
        for(int i=0; i< nums.length; i++){
            n_nums[i + nums.length] =nums[i];
        }
        return n_nums;
    }
}