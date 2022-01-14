class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       int numTracker = k;
        int index = num.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
            while(index >= 0 || numTracker > 0){
                if( index >= 0){
                    numTracker += num[index];
                }
                int rem = numTracker % 10;
                list.add(rem);
                numTracker = numTracker /10;
                index--;
            } 
        
        Collections.reverse(list);
        return list;
    }
}