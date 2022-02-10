class Solution {
    public boolean isValidSudoku(char[][] board) {
       //create an array of HashSets of size n which is going to contain hashsets.
        int n = board.length; 
        Set<Integer>[] row = new Set[n];
        Set<Integer>[] col = new Set[n];
        Set<Integer>[] block = new Set[n];
        
        for(int i = 0; i< n; i++){
            row[i] = new HashSet<Integer>();
            col[i] = new HashSet<Integer>();
            block[i] = new HashSet<Integer>();
        }
        //now check the rows,columns, and blocks for the repeated number
         for(int i =0; i< n; i++){
             for(int j =0; j< n; j++){
                 if(board[i][j] != '.'){
                     //determine which block to validate.
                     int k = 3 * (i/3) + (j/3);
                     int num = board[i][j];
                     if(row[i].contains(num))return false;
                     if(col[j].contains(num))return false;
                     if(block[k].contains(num))return false;
                     
                     row[i].add(num);
                     col[j].add(num);
                     block[k].add(num);
                 }
             }
         }
     return true;   
    }        
}

    
