import java.util.*;

public class Source {
   public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       primesLessThanOrEqualTon(n);
   }

   // Method to print all primes less than or equal to n in ascending order
   static void primesLessThanOrEqualTon(int n) {
       if (n >=2){
           for(int i = 2; i <= n; i++){
                boolean isPrime = true;
                for(int j = i-1; j >=2; j--){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime)
                    System.out.print(i+" ");       
            }
       } else {
           System.out.println("There are no prime numbers less than or equal to "+n);
       }
   }
}
