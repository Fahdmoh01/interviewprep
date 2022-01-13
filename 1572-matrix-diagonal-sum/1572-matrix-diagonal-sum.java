class Solution {
    public int diagonalSum(int[][] mat) {
        //take the diagonals as moving one step forward down the stairs i.e at each new row, the index moves forward by one 
        int totalSum = secondaryDiagSum(mat) + primeDiagSum(mat);
        //diagonals only intersect for odd length matrix hence remove the repeated addition of the intersection
        if(mat.length % 2 != 0){
            int mid= mat.length /2;
            totalSum = totalSum - mat[mid][mid];
            return totalSum;
        }
        return totalSum;
    }
    
    int secondaryDiagSum(int[][] arr){
        int end = arr.length -1;
        int secSum = 0;
        while(end >= 0){
            for(int row=0; row <arr.length; row++){
                secSum += arr[row][end];   
                end--;
            }
        }
        return secSum;
    }
    
    int primeDiagSum(int[][] arr){
        int start = 0;
        int primeSum = 0;
        while( start < arr.length){
        for(int row=0; row <arr.length; row++){
                primeSum += arr[row][start];
                start++;
            }
        }
        return primeSum;
    }
}