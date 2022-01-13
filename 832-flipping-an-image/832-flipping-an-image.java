class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row: image){
            reverseRow(row);
        }
        swapZeroesandOnes(image);

        return image;
    }
    
    void reverseRow(int arr[]){
        int start =0;
        int end = arr.length - 1;
        
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
    
    void swapZeroesandOnes(int[][] arr){
        for(int i = 0; i< arr.length; i++){
            for(int j =0; j< arr[0].length; j++){
                if(arr[i][j] == 0){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = 0;
                }
            }
        }
    }
}