class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        /*
        while the matrix boundaries not elapsed, traverse right, down, left and upward.if rows don't overlap, you can still traverse left. if columns don't overlap you can still traverse upwards.
        */
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int rowBegin=0; 
        int rowEnd = matrix.length -1;
        int colBegin =0; 
        int colEnd = matrix[0].length - 1;
        
        while(rowBegin <= rowEnd && colBegin <= colEnd){
            //Traverse Right
            for(int i =colBegin; i<= colEnd; i++){
                list.add( matrix[rowBegin][i]);
            }
            rowBegin++;
            
            //Traverse Down
            for(int i =rowBegin; i<=rowEnd; i++){
                list.add(matrix[i][colEnd]);
            }
            colEnd--;
            
            if(rowBegin <= rowEnd){
             //TraverseLeft
                for(int i = colEnd; i>=colBegin; i--){
                    list.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;  

            
            if(colBegin <= colEnd){
             //TraverseUpwards
                for(int i =rowEnd; i>=rowBegin; i--){
                    list.add(matrix[i][colBegin]);
                }   
            }
            colBegin++;
            
        }

        return list;
    }
}

