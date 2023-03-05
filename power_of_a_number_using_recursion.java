Input: The input will be in the following format: 

// The first line should have the base value.
// The second line should have the value of the exponent to which the exponent is to be raised. 
// Output: The output should be in the following format:

// Power of the given value.
// Sample Input:
// 2
// 3

// Sample Output:
// 8

// Sample Input:
// 3
// 2
// Sample Output:
// 9 

import java.util.Scanner;

public class Source {
    // function to calculate base^exponent
    public static int powerfunc(int base, int power) {
        if(power < 1){
            return 1;
        } else {
            return base * powerfunc(base, power-1);
        }
        
    }
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int a = inpt.nextInt();
        int b = inpt.nextInt();
        // printing the value of a^b i.e.,
        System.out.printf("%d", powerfunc(a, b));
    }

}
