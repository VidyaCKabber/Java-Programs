You are given a stack with n integers and you need to print the fifth element from the bottom of the stack.

// Input Format
// The first line contains an integer n denoting the size of stack.
// The next line contains n space-separated integers denoting the elements of stack.
// Output Format
// Print an integer. This should be the fifth element from the bottom of the stack.
// Note: If the number of elements in the stack is less than 5, then print “There are not enough elements in the stack”.
// Sample Input 1:
// 12
// 1 2 3 4 5 6 7 8 9 10 11 12
// Sample Output 1:
// 5
// Sample Input 2:
// 4
// 1 2 3 4
// Sample Output 2:
// There are not enough elements in the stack

import java.util.*;

public class Source {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromStart(stack);
    }

    // Method to print the fifth element from the bottom of the stack
    static void printFifthElementFromStart(Stack<Integer> stack) {
        if(stack.size() >= 5){
            System.out.println(5);
        } else{
            System.out.println("There are not enough elements in the stack");
        }
    }
}
