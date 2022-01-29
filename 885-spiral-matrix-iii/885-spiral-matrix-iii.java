class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
     //using the directions technique to move
        
        int mat[][] = new int[rows * cols][2];
        //directions technique right(0,1) down(1,0) left(0,-1) up(-1,0)
        int directionsR[] = new int[]{0,1,0,-1};
        int directionsC[] = new int[]{1,0,-1,0};
        
        int dTracker=0;
        int travelD=0;
        int rowTracker =0;
        mat[rowTracker] = new int[]{rStart, cStart};
        rowTracker++;
        
        while( rowTracker < rows * cols){
            if( dTracker==0 || dTracker == 2){
                travelD++;
            }
            //this loops keeps running until the loops gets to a legal matrix coordinate that has not yet been traversed
            for(int i =0; i<travelD; i++){
                rStart += directionsR[dTracker];
                cStart += directionsC[dTracker];
                //check if the new rows and columns are within the matrix boudaries
                if(rStart < rows && rStart>=0 && cStart < cols &&  cStart>=0){ 
                    mat[rowTracker] = new int[]{rStart, cStart};
                    rowTracker++;
                }
            }
            
            dTracker++;
            dTracker = dTracker % 4; //since you can only travel in four directions
            
        }
        
        return mat;
    }
}