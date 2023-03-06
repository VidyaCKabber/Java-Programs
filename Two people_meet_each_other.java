//You will be given starting points of two people p1 and p2 respectively and the distance covered by two people in each jump is s1 and s2, respectively. You need to find whether they meet after the same number of jumps from their starting points. The starting points of the two persons should always be different.

// Input: The input will be in the following format : 

// The first line should be the values of p1 and p2 respectively space-separated.
// The second line should be the values of s1 and s2 respectively space-separated.
 

// Output: The output should be of the following format:

// Print ‘YES’ if they meet at some point after jumping for an equal number of times; otherwise, print ‘NO’.


// Example : 

// Input : 

// 6 8
// 3 2

// Output:
// YES

import java.util.*;

public class Source {
   public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       int p1 = s.nextInt();
       int p2 = s.nextInt();
       int s1 = s.nextInt();
       int s2 = s.nextInt();
       twoPeopleMeet(p1, p2, s1, s2);
   }

   // Method to find whether two people meet after jumping for the same number of times
   static void twoPeopleMeet(int p1, int p2, int s1, int s2) {
       int flog = 0, p1_at = p1, p2_at = p2, MAX_LIMIT = 10;
       
       while(p1_at < MAX_LIMIT || p2_at < MAX_LIMIT){
           p1_at += s1;
           p2_at += s2;
           
           if(p1_at == p2_at){
               flog = 1;
               System.out.println("YES");
               break;
           }
       }
       if(flog == 0){
           System.out.println("NO");
       }
   }
}
