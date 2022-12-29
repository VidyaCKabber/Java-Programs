import java.util.*;
public class AverageOfNumbers {

   public static void main(String[] args) {

       Scanner input= new Scanner(System.in);
       int n=input.nextInt();
       int sum=0, m;
       
       for(int i=0; i<n; i++){
           m = input.nextInt();
           sum = sum+m;
       }
       System.out.println((sum/n));
   }
}
