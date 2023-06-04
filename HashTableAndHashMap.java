import java.util.*;
import java.lang.*;

class HashTableAndHashMap {
    public static void main(String[] args) {
        
        // Hash table
        System.out.println("============Hash Table===========");
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(100, "Vidya");
        ht.put(101, "Vijay");
        ht.put(102, "Adrushta");
        
       
        for(Map.Entry t: ht.entrySet()){
            System.out.println( t.getKey()+" : "+t.getValue());
        }
        
        System.out.println(ht.containsKey(102));
        String a = ht.get(102);
        System.out.println(a);
        System.out.println(ht.remove(102));
        System.out.println(ht.containsKey(102));
        
        //Hash Map
        System.out.println("");
        System.out.println("============Hash Map===========");
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        ht.put(100, "Vidya");
        ht.put(101, "Vijay");
        ht.put(102, "Adrushta");

        
        for(Map.Entry m: ht.entrySet()){
            System.out.println( m.getKey()+" : "+m.getValue());
        }
        
        System.out.println(hm.containsKey(102));
        String b = ht.get(102);
        System.out.println(b);
        System.out.println(ht.remove(102));
        System.out.println(hm.containsKey(102));
    }
}
