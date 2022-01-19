class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> listRow = new ArrayList<>();
        ArrayList<Integer> listCol = new ArrayList<>();
        ArrayList<Integer> finalList = new ArrayList<>();
        
        int row = matrix.length;
        int col = matrix[0].length;
        //find maximum in each col
        for(int j = 0; j<col; j++){
            maxCol(matrix, j, listCol); 
        }
        //find minimum in Each row
        for(int i=0; i<row; i++){
            minRow(matrix, i,listRow);
        }
        //scan through and compare the element with the elements in ArrayList
        for(int i =0; i<row; i++){
            for(int j =0; j<col; j++){
                if(matrix[i][j] == listRow.get(i) && matrix[i][j] == listCol.get(j))
                    finalList.add(matrix[i][j]);
            }
        }
        
      return finalList;
    }
    
    //check maximum in column
    void maxCol(int arr[][], int col,ArrayList<Integer> listCol){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row<arr.length; row++){
           max = Math.max(max,arr[row][col]);
        }
        listCol.add(max);
    }
    
    //check minimum in row
    void minRow(int arr[][], int row, ArrayList<Integer> listRow){
        int min = Integer.MAX_VALUE;
        for(int col = 0; col<arr[0].length; col++){
           min = Math.min(min,arr[row][col]);
        }
        listRow.add(min);
    }
    
}