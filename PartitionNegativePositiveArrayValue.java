//Partition Negative and Positive in an Array


import java.util.*;

public class PartitionNegativePositiveArrayValue {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
       }
       partitionNegativeAndPositive(n, arr);
   }

   // Method to partition negative and positive numbers without comparing with 0
   static void partitionNegativeAndPositive(int n, int arr[]) {
      // Write your code here
      if(arr[0] >= 0){
          Positive(n, arr);
          System.out.print("\n");
          Negative(n, arr);
      } else{
          Negative(n, arr);
          System.out.print("\n");
          Positive(n, arr);
      }
   }
   
   static void Positive(int n, int arr[]){
       boolean noPos = true;
       for(int i=0; i<n; i++){
           if(arr[i] >= 0){
               noPos = false;
               System.out.print(arr[i]+" ");
           }
       }
       if(noPos){
           System.out.println("Array doesn't have positive numbers");
       }
       
   }
   
   static void Negative(int n, int arr[]){
       boolean noNeg = true;
       for(int i=0; i<n; i++){
           if(arr[i] < 0){
               noNeg = false;
               System.out.print(arr[i]+" ");
           }
       }
       if(noNeg){
           System.out.println("Array doesn't have negative numbers");
       }
   }
}
