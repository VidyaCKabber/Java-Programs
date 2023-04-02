import java.util.*;
import java.util.Hashtable;

class FirstProgram {
    public static void main(String[] args) {
        Hashtable<String, Integer> contacts = new Hashtable<String, Integer>();
        
        contacts.put("Vidya", 123456);
        contacts.put("Ram", 234567);
        contacts.put("Sita", 5634234);
        contacts.put("John", 234131);
        
        System.out.println(contacts.size());
        System.out.println(contacts.containsKey("john")); //false
        System.out.println(contacts.get("John")); // gets value of the desired key
        System.out.println(contacts.get("vijay")); // null
        
        Set<String> keys = contacts.keySet();
        
        for(String key : keys){
            System.out.println("Number of "+key+" is:"+contacts.get(key));
        }
        
        contacts.remove("John");
        System.out.println(contacts);
        
        contacts.clear();
        System.out.println(contacts);
        System.out.println(contacts.size());
    }
}
