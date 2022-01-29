class Solution {
    public void setZeroes(int[][] matrix) {
    //using two hashset to contains rows an cols index of zeroth element
        HashSet<Integer> rSet = new HashSet<>();
        HashSet<Integer> cSet = new HashSet<>();
        
        for(int i =0; i< matrix.length; i++){
            for(int j =0; j< matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rSet.add(i);
                    cSet.add(j);
                }
            }
        }
        
          for(int i =0; i< matrix.length; i++){
            for(int j =0; j< matrix[0].length; j++){
                if(rSet.contains(i) || cSet.contains(j)){
                    matrix[i][j]= 0;
                }
            }
        }
        //Time complexity = O(M x N) Space Complexity = O(M x N)
    }
}