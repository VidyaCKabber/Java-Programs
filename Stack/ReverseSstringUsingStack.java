// You are given a string and you have to print the reverse of the string using a stack.

// Input Format
// A string which has to be reversed.
// Output Format
// The reverse of the input string 
// Sample Input 1:
// abcd
// Sample Output 1:
// dcba
// Sample Input 2:
// abcdef
// Sample Output 2:
// fedcba


import java.util.Scanner;
import java.util.*;

public class ReverseSstringUsingStack{
    public static void main(String arg[]) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        
        char[] reversedString = new char[data.length()];
        
        for(int i=0; i<data.length(); i++){
            s.push(data.charAt(i));
        }
        
        int j=0;
        while(!s.isEmpty()){
            reversedString[j++] = s.pop();
        }
        
        System.out.println(reversedString);
    }
}
