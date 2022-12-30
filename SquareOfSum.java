
// Description
//  Write a program that takes two numbers as input and returns the square of their sum.
// For e.g., if the input numbers - 4 and 9 are passsed as parameters into the function, it should return  169, which is  (4+9)2

import java.util.Scanner;
import java.lang.Math;

class Source {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Enter the numbers in the input console
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
        System.out.print(squareOfSum(number1, number2));
	}
	
	// Write the function squareOfSum here
	public static int squareOfSum(int a , int b){
	    int sum = 0;
	    sum = (int)Math.pow((a+b), 2);
	    return sum;
	}
}
