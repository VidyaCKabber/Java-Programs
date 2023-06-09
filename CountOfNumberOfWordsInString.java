import java.util.*;

class CountOfNumberOfWordsInString {
    public static void main(String[] args) {
        String string = "I'm going to Bangalore. I will stay in PG. I will eat there";
        
        String[] newString = string.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(String s : newString){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
            else{
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }
}
