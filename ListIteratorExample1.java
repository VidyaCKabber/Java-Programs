import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class ListIteratorExample {
    public static void main(String[] args) {
        
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
           
        display(l);
        
    }
    public static void display(List<Integer> numberList){
        ListIterator<Integer> it = numberList.listIterator(numberList.size());
        
       while(it.hasPrevious()) {
           if(it.hasPrevious()) {
               System.out.println(it.previous());
           }
           it.previous();
       } 
    }
}
