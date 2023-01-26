// The following code was written using an array in your previous practice coding question. Modify the code, and implement it using the ArrayList. 

// Also, a new element 99 must be added at the end of the newly implemented ArrayList. This implementation is already written in the code.


import java.util.ArrayList;                  

class Source {
   public static void main(String[] args) {
       
    ArrayList arrayList = new ArrayList();
    arrayList.add(2);
    arrayList.add(4);
    arrayList.add(5);
    arrayList.add(10);
    arrayList.add(99);
    printArray(arrayList);
   }

   public static void printArray(ArrayList arrList) {  
       for(Object o : arrList) {  
           Integer i = (Integer) o;
           System.out.println(i);
       }
   }
}
