// Description
// Write a program to implement the basic methods of stack i.e. push( ) and pop( ) using a single queue. Your program should take the following lines of input: 
// The number of elements you want to insert in the stack. 
// Elements of the stack.
//  Note: 
// If there are no elements in the stack then, print “ Stack is empty” 
// The stub code consists of the print statements in the main method that would first display the topmost element in the original stack then the topmost element after one pop( ) operation.

import java.util.*;

public class StacksUsingSingleQueue {

    /*implementing queue using linked list */
    Queue < Integer > q = new LinkedList < Integer > ();

    /* Push operation of stack using queue*/
    void push(int x) {
        //write your code here
        int size = q.size();
        q.add(x);
        for (int i = 0; i < size; i++) {
          int temp = q.remove();
          q.add(temp);
        }
    }

    /*Removes the top element of the stack*/

    int pop() {
        //write your code here
         if (q.isEmpty()) {
          System.out.println("Stack is empty");
          return -1;
        }
        return q.remove();
    }


    /*Returns the element at the top of the stack */
    int top() {
        //write your code here
        return q.peek();
    }


    public static void main(String[] args) {
        Source obj = new Source();
        Scanner in = new Scanner(System.in);

        /*Enter the number of elements you want to add in the stack */

        int n = in .nextInt();
        
        if(n > 0){
            /*Enter the elements of the stack */
            for (int i = 0; i < n; i++) {
                obj.push( in .nextInt());
            }
    
            System.out.println(obj.top());
            obj.pop();
            System.out.println(obj.top());
        } else {
            System.out.println("Stack is empty");
        }
    }
}
