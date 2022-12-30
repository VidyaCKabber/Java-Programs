// Description

// Write Java code to calculate the HCF or the greatest common divisor of two numbers. Once you've calculated the HCF of two numbers, print out the HCF.
// Hint: HCF is the highest number that divides two numbers. So your loop should start by checking if the lower of the two numbers entered is the HCF and then check the numbers below, one by one until the HCF is found.
// For e.g., if the numbers entered are 12 and 45, the output is 3.


import java.util.Scanner;

class Hcf {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);		
    // Enter number 1 in the Input Console
    int num1 = scan.nextInt();
    // Enter number 2 in the Input Console
    int num2 = scan.nextInt();
	
	int hcf=0, temp=0;	
	temp = num1>num2 ? num1:num2;
    // Write logic 
    
    while(temp > 0){
        if(num1%temp == 0 && num2%temp == 0){
            hcf = temp;
            break;
        }
        temp = temp - 1;
    }
    	
    System.out.print(hcf);
    scan.close();
  }
}
