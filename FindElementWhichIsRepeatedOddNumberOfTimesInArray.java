// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class FindElementWhichIsRepeatedOddNumberOfTimesInArray {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        
        int[] array = {4, 1, 4, 3, 2, 8, 9, 1, 1, 4};
    
        Arrays.sort(array);
        System.out.println(array);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i : array){
            
            if(map.containsKey(i)){
                 map.put(i, map.get(i)+1);
            }
            else{
                 map.put(i, 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> j : map.entrySet()){
            
            if(j.getValue() != 0)
                System.out.println(j.getKey() +" : "+j.getValue());
        }
    }
}
