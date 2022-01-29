class Solution {
    public void setZeroes(int[][] matrix) {
    //O(N) space solution: using two hashset to contains rows an cols index of zeroth element
//         HashSet<Integer> rSet = new HashSet<>();
//         HashSet<Integer> cSet = new HashSet<>();
        
//         for(int i =0; i< matrix.length; i++){
//             for(int j =0; j< matrix[0].length; j++){
//                 if(matrix[i][j] == 0){
//                     rSet.add(i);
//                     cSet.add(j);
//                 }
//             }
//         }
        
//           for(int i =0; i< matrix.length; i++){
//             for(int j =0; j< matrix[0].length; j++){
//                 if(rSet.contains(i) || cSet.contains(j)){
//                     matrix[i][j]= 0;
//                 }
//             }
//         }
        //Time complexity = O(M x N) Space Complexity = O(M x N)
        
        /*
        O(1) Approach solution:check if the first column has a zero.continue the check from second element and use the first row/col as setZero tracker.
        */
        boolean isZero = false;
        for(int i =0; i< matrix.length; i++){
            //check if the first column has a zero 
            if(matrix[i][0] == 0){
                isZero = true;
            }
            
            //continue the check from second element and use the first row/col as setZero tracker
            for(int j =1; j< matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        //traverse the matrix and take note of the index of rows and columns of the tracker r/c and set the zeros.
          for(int i =1; i< matrix.length; i++){
            for(int j =1; j< matrix[0].length; j++){
                if(matrix[0][j] ==0 || matrix[i][0] == 0){
                    matrix[i][j]= 0;
                }
            }
        }
        //check if first row needs to be set as 0.
        if(matrix[0][0] == 0){
            for(int i=0; i < matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }
        
        //check if first zero needs to be set to zero
        if(isZero){
            for(int i=0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
        
        
    }
}