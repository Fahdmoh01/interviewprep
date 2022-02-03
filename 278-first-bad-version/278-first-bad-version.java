/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        /*whie start< end. if true - search left. if false - search right.
        */
        //Edge Case.
        //if(n<=2 && isBadVersion(n) == true) return n;
        
        int first = search( n, true);
        int only = search( n, false);
        
        if(first == -1){
            return only;
        }
        
        return first;
    }
    
    int search( int num, boolean first){
        int start  = 1;
        int end = num;
        int ans = -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(isBadVersion(mid) == false){
                start = mid + 1;
            }else{
                if(isBadVersion(mid) == true){
                    ans = mid;
                }
                if(first){
                    end = mid;
                }else{
                    start = mid + 1;
                }
            }
        }
        
        return start;
    }
}