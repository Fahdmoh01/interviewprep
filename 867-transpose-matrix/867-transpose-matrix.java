class Solution {
    public int[][] transpose(int[][] matrix) {
        int n_matrix[][] = new int[matrix[0].length][matrix.length];
        for(int i = 0; i< n_matrix.length; i++){
            for(int j =0;j< n_matrix[0].length;j++){
                n_matrix[i][j]= matrix[j][i];
            }
        }
        return n_matrix;
    }
}