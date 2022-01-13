class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int [gain.length + 1];
        arr[0] = 0;
        int sum = arr[0];
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<gain.length; i++){
            sum += gain[i];
            arr[i + 1] = sum;
        }
        for(int num : arr){
         max = Math.max(max, num);
        }
        //System.out.println(Arrays.toString(arr));
        return max;
    }
}