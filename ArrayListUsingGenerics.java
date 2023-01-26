Complete the code below to create an ArrayList named ‘random’, using // Generics, with five elements — 2, 4, 5, 10, and 99.9 — stored as float-type values in ArrayList, and then, print this ArrayList using the printList method.
  
import java.util.ArrayList;

class Source {

   public static void main(String[] args) {
      
       ArrayList<Float> arrayList = new ArrayList<Float>();
       arrayList.add(2f);
       arrayList.add(4f);
       arrayList.add(5f);
       arrayList.add(10f);
       arrayList.add(99.9f);
      
       printArray(arrayList);
   }

   public static void printArray(ArrayList<Float> arrList) {
       for (Float a: arrList){
           System.out.println(a);
       }
   }
}
