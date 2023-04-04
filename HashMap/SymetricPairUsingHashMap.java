import java.util.HashMap;
import java.util.Scanner;

class SymetricPairUsingHashMap {

   public static void main(String arg[]) {
       Scanner in = new Scanner(System.in);

       //number of pairs in the array
       int n = in.nextInt();
       int arr[][] = new int[n][2];

       // store the input pairs to an array "arr"
       for (int i = 0; i < n; i++) {
           arr[i][0] = in.nextInt();
           arr[i][1] = in.nextInt();
       }
       // Create an empty hashMap
       HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

       boolean flag = false;

       // Traverse through the given array "arr"
       for (int i = 0; i < arr.length; i++) {
           // First element of the current pair
           int first1 = arr[i][0];
            System.out.println(first1);
           //Second element of the current pair
           int second1 = arr[i][1];
            System.out.println(second1);
           // Check if second element of the current pair is present in
           // the hashmap or not
           Integer data = hashMap.get(second1);
           System.out.println(data);
           //If present and the first1 element of the current pair and
           // value of the key in hashmap are same
           if (data != null && data == first1) {
               System.out.println(second1 + " " + first1);
               flag = true;
           }
           /*Otherwise, add that current pair to the hashmap considering
           the first1 element of the pair as the key and second element
           of the pair as the value of the key in the hashmap.*/
           else
               hashMap.put(first1, second1);
       }
       if (!flag) {
           System.out.println("No Symmetric pair");
       }
   }
}
