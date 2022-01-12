class Solution {
    public boolean checkIfPangram(String sentence) {
//         int [] chars = new int[26];
//         char[] charArray = sentence.toCharArray();
//         for(char c : charArray){
//             chars[c -'a']++;
//         }
        
//         for(int num: chars){
//             if(num == 0) return false;
//         }
        
//         return true;
    
    int [] chars = new int[26];
    for(int i =0; i < sentence.length(); i++){
        chars[sentence.charAt(i) - 'a']++;
    }
        for(int num: chars){
            if(num == 0) return false;
        }
        
        return true;

    }
}