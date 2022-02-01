class Solution {
    public int largestAltitude(int[] gain){
        int max=0;
       // int arr[] = new int[gain.length + 1];
        int currentSum = 0;
        for(int i = 0; i< gain.length; i++){
            currentSum = currentSum + gain[i];
            //arr[i + 1] = currentSum;
            max = Math.max(max, currentSum);
        }
        return max;
    }
}