// Description

// Write a code that prints the highest power of 2, less than or equal to a given number. 
// For e.g., if the input number is 9, the code should print 8, as 8 or  23 is the highest power of two which is less than 9. 

import java.util.Scanner;
import java.lang.Math;

class Source {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // Enter the number
    int number = scan.nextInt();  
    int result = 1, i; 
    if(number >= 2) {
     
    for(i = 1; i < number; i++) {
      // Write the logic
      int ans1 = (int) Math.pow(2,i); 
      
      if (ans1 < number){
          continue;
      }
      result = (int) Math.pow(2, (i-1)); 
      break;
    } 
    
    System.out.print(result);
    
    } else {
      System.out.print("Please enter an integer >= 2");   
    }
    scan.close();
  }
}
