/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        /*whie start< end. if true - search left. if false - search right.
        */
        //Edge Case.
        
        int first = search(n);

        
        return first;
    }
    
    int search( int num){
        int start  = 1;
        int end = num;
        //int ans = -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(isBadVersion(mid) == false){
                start = mid + 1;
            }else{
                if(isBadVersion(mid) == true){
                    end = mid;
                }
            }
        }

        return start;
    }
}