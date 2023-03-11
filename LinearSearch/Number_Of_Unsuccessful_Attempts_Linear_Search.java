
import java.util.*;


 class Number_Of_Unsuccessful_Attempts_Linear_Search {
   public int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
   int count =0 ;
    for(int i=0; i<inputArr.length; i++){
        if(inputArr[i] == key){
            return count;
        }
        count++;
     }
      return count;
   }
   
   public static void main(String[] args){
       Number_Of_Unsuccessful_Attempts_Linear_Search source = new Number_Of_Unsuccessful_Attempts_Linear_Search();
       
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       int[] array = new int[n];
       
       for(int i=0; i< n; i++){
           array[i] = input.nextInt();
       }
       
       int key = input.nextInt();
       
       int count = source.getLinearSearchUnsuccessfulComparisonCount(array, key);
       System.out.println(count);
   }
 }
