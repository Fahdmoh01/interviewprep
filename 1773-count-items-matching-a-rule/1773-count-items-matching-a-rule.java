class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        //using == to compare strings does not work correctly. use str.equals("stringName")
        int count = 0;
        for(List<String> product : items){
            boolean checker =findMatch(product, ruleKey, ruleValue);
            if(checker)count++;
        }
        return count;
    }
    
    boolean findMatch(List<String> list, String rk, String rv){
        if(rk.equals("type")){
            System.out.println(list.get(0));
            return rv.equals(list.get(0));
        }else if(rk.equals("color")){
            return rv.equals(list.get(1));
        }else{
             return rv.equals(list.get(2)); 
        }
    }
}