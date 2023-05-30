import java.util.*;
 
// Main class
public class SortLinkedList {
 
    // Driver code
    public static void main(String args[])
    {
        // Creating object of the
        // class linked list
        LinkedList<String> ll = new LinkedList<String>();
 
        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
 
    
        Collections.sort(ll);
 
        System.out.println(ll);
        Collections.sort(ll, Collections.reverseOrder());
 
        System.out.println(ll);
    }
}
