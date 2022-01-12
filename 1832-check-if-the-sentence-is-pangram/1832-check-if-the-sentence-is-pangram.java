class Solution {
    public boolean checkIfPangram(String sentence) {
//         int [] chars = new int[26];
      
//         for(char c :  sentence.toCharArray()){
//             chars[c -'a']++;
//         }
        
//         for(int num: chars){
//             if(num == 0) return false;
//         }
        
//         return true;
    
//     int [] chars = new int[26];
//     for(int i =0; i < sentence.length(); i++){
//         chars[sentence.charAt(i) - 'a']++;
//     }
//         for(int num: chars){
//             if(num == 0) return false;
//         }
        
//         return true;

        boolean [] chars = new boolean[26];
      
        for(char c :  sentence.toCharArray()){
            chars[c -'a'] = true;
        }
        
        for(boolean checker: chars){
            if(!checker) return false;
        }
        
        return true;
       
    }
}