class Solution {
    public int diagonalSum(int[][] mat) {
        int sec = secDiagonal(mat);
        int prim = primDiagonal(mat);
        int totalSum = sec + prim;
        
        if(mat.length % 2 != 0){
            return totalSum - mat[mat.length /2][mat[0].length/2];
        }
        
        return sec + prim;
    }
    
    int primDiagonal(int arr[][]){
        int sum =0;
        int diagTracker =0;
        for(int i =0; i<arr.length; i++){
            sum += arr[i][diagTracker];
            diagTracker++;
        }
        return sum;
    }
    
    int secDiagonal(int arr[][]){
        int sum = 0;
        int diagTracker = arr[0].length - 1;
        for(int i = 0; i< arr.length; i++){
            sum += arr[i][diagTracker];
            diagTracker--;
        }
        return sum;
    }
}