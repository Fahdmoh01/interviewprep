class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        /*
            
        */
        for(int i =0; i<4; i++){
            if(Arrays.deepEquals(mat,target))return true;
            mat = rotateMatrix(mat);
        }
        return false;
    }
    
    int[][] rotateMatrix(int[][] matrix){
            int row = matrix.length;
            int col = matrix[0].length;
            int new_matrix[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                new_matrix[j][row-1-i]= matrix[i][j];
            }    
        }
        return new_matrix;
    }

    
    
}