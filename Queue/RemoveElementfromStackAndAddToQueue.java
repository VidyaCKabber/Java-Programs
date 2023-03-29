// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class RemoveElementfromStackAndAddToQueue {
    public static void main(String[] args) {
        Stack < Integer > inputStack = new Stack < Integer > ();
        
        Queue<Integer> queue = new LinkedList<Integer>();
        
        inputStack.add(1);
        inputStack.add(1);
        inputStack.add(2);
        inputStack.add(5);
        inputStack.add(3);
        inputStack.add(8);
        
        System.out.println(inputStack);
        
        while(!inputStack.isEmpty()){
            int top = inputStack.pop();
            queue.add(top);
        }
        
        
        System.out.println(queue);
    }
}
