class Solution {
    public int mySqrt(int x) {
     if(x <= 1) return x;
       return binarySearch(x);
    }
    
    int binarySearch(int target){
        int start=1;
        int end =target/2;
        while(start<=end){
          int mid = start + (end- start)/2;
          if(mid == target/ mid){
            return mid;    
          }else if( mid  > target/mid){
                end = mid - 1;
          }else{
                start = mid + 1;
           }  
        }
        return end;
    }
}