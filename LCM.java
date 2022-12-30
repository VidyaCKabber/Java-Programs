// Description

// Write a function that takes two numbers as parameters and returns the LCM of these two numbers. 
// So, if the values passed into the function are 12 and 20, the function will return the lowest common multiple of these two, i.e 60.

import java.util.Scanner;

class LCM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Enter the two numbers in the input console
        int number1 = scan.nextInt();
		int number2 = scan.nextInt();
        System.out.print(lcm(number1, number2));
	}
	
	// Write the LCM function here
	
	public static int lcm(int num1, int num2){
	   int max, lcm; 
	   max = num1 > num2 ? num1: num2;
	   while(true){
	      if(max%num1 ==0 && max%num2==0){
	          lcm = max;
	          break;
	      } 
	      ++max;
	   }
	   return lcm;
	}
 
}
