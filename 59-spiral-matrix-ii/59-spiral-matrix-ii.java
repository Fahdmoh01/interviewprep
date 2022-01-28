class Solution {
    public int[][] generateMatrix(int n) {
        int mat[][] = new int [n][n];
        int rowBegin =0;
        int rowEnd = n -1;
        int colBegin = 0; 
        int colEnd = n -1;
        int val = 1;
        while(rowBegin <= rowEnd && colBegin <= colEnd && val <= n * n ){
            //travers right and insert values
            for(int i = rowBegin; i<= colEnd; i++){
                mat[rowBegin][i]= val;
                val++;
            }
            rowBegin++;
            
            //traverse down and insert values
            for(int i= rowBegin; i<=rowEnd; i++){
                mat[i][colEnd] = val;
                val++;
            }
            colEnd--; 
            
            //traverse left and insert values
            if(rowBegin <= rowEnd){
                for(int i = colEnd; i >= colBegin; i--){
                    mat[rowEnd][i] = val;
                    val++;
                } 
            }
            rowEnd--;
            
            //traverse upward and inser values
            if(colBegin <= colEnd){
                for(int i = rowEnd; i>=rowBegin; i--){
                    mat[i][colBegin] = val;
                    val++;
                }
            }
            colBegin++;
            
        }

        return mat;
    }
}