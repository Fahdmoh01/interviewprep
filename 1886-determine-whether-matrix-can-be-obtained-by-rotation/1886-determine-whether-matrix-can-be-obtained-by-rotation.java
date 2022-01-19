class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i =0; i< 4; i++){
            if(Arrays.deepEquals(mat,target))
                return true;
            rotateMatrix(mat);
        }
        
        return false;
    }
    
    
    void rotateMatrix(int[][] mat){
/*new swap the values at each diagonal and swap the values in the columns/horizontals more like reverse colunmns/horizontals*/
        int row = mat.length;
        int col = mat[0].length;
        //int n_matrix[][] = new int[row][col];
        //swap diagonals
        for(int i =0; i< row; i++){
            for(int j =0; j<i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
       // swap values at each column/horizontals
        int n = mat.length;
        for(int i =0; i< row; i++){
            for(int j =0; j<n-1-j; j++){
               int temp = mat[i][n-1-j];
                mat[i][n-1-j] = mat[i][j];
                mat[i][j] = temp;
            }
        }
        //put values in new matrix
        // for(int i =0; i< row; i++){
        //     for(int j =0; j<col; j++){
        //         n_matrix[i][j] = mat[i][j];
        //     }
        // }
        // return n_matrix;
    }
    
    
}