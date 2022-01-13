class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] nums = new int[m][n];
            for(int[] index: indices){
                rowIncrement(nums,index,n);
                colIncrement(nums,index, m);
            }
        int numOfOdds = findOddNumbers(nums,m, n);

        return numOfOdds;
    }
    
    void rowIncrement(int[][] arr, int[] index, int col){
            for(int i=0; i<col; i++){
                arr[index[0]][i] += 1;
            }
    }
    
    void colIncrement(int[][]arr, int[] index,int row){
            for(int i =0; i< row; i++){
                arr[i][index[1]] += 1;
            }
    }
    
    int findOddNumbers(int [][] arr, int row, int col){
        int count = 0;
        for(int[] rowVal: arr){
            for(int num: rowVal){
                if(num % 2 != 0) count++;
            }
        }
        return count;
    }
}