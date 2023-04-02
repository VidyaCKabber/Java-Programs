import java.util.*;

public class HighestFrequencyString{
	
	public static void main(String[] x){
		Map<String,Integer> map = new HashMap<>();
		
		String[] arrays = {"Skinshape", "Mild_Orange", "Arctic_Monkeys", "The_Strokes", "Arctic_Monkeys", "Summer_Salt", "Feng_Suave", "The_Buttertones", "Mild_Orange", "Arctic_Monkeys"};
		
	
		for(String key : arrays){
		    int count = 1;
		    if(map.containsKey(key)){
		        int valueCount = (int)map.get(key)+1 ;
		        map.put(key, valueCount);
		    } else{
		        map.put(key, count);
		    }
		}
		
		// get higest key
		Set<String> keys = map.keySet();
		
		Map.Entry<String,Integer> maxEntry = null;
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
 
        System.out.println(maxEntry);
	}
}
