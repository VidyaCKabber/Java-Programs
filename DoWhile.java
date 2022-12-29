/*Description
Print first n integers starting from 0 in the reverse order using the do-while loop.
(n is an integer entered by the user)
Sample Input:
5
Sample Output
5
4
3
2
1
0
*/

import java.util.*;
public class DoWhile {

   public static void main(String[] args) {
     int n;
     Scanner input= new Scanner(System.in);
     n=input.nextInt();
     int counter=n;
     
     do{
        System.out.println(counter); 
        counter = counter - 1;
     }while(counter >= 0);
   }
}
