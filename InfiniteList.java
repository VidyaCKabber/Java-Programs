import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class InfiniteList {
    public static void main(String[] args) {
        
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        
        ListIterator<Integer> listIterator = arrayList.listIterator();
        while(listIterator.hasNext()) {
                 System.out.print(listIterator.next());
                 listIterator.previous();
        }
 }
