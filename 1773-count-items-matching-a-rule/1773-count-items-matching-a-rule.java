class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int sum =0;
        for(List<String> item : items){
            int count = matching(item, ruleKey, ruleValue);
            sum+= count;
        }
        return sum;
    }
    
    int matching(List<String> item,String rKey, String rVal){
        if(rKey.equals("type")){
            String type= item.get(0);
            if(type.equals(rVal))return 1;
        }else if(rKey.equals("color")){
            String color = item.get(1);
            if(color.equals(rVal))return 1;
        }else{
            String name = item.get(2);
            if(name.equals(rVal))return 1;
        }
        return 0;
    }
    
    
}