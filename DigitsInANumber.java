// Description
// Write a Java program to count the number of digits in a number entered by the user.

// Hint: You can use the "/" operator here.



// Sample Input:

// 123455

// Sample Output:

// 6

import java.util.*;
public class DigitsInANumber {

   public static void main(String[] args) {
       int n, count = 0;
       Scanner input= new Scanner(System.in);
       n=input.nextInt();
       do{
           n = n/10;
           count = count +1;
       }while(n>0);
       System.out.println(count);
    }
}


