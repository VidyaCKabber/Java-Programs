import java.util.List;
import java.util.ArrayList;

class AddElementToSpecificIndexOfList{
    public static void main(String[] args) {
        
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(8);
        l.add(4);
           
        process(l);
    }
    public static void process(List<Integer> numberList){
        numberList.add(2, 5);
        System.out.println(numberList.get(3));
        
    }
}
