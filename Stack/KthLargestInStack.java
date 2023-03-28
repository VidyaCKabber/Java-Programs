import java.util.*;

public class KthLargestInStack {
 
   public static void findKthLargestNum(Stack <Integer> stack, int k) {
      int count = 1;
        int kthLargest = stack.pop();
        while (!stack.isEmpty() && count < k) {
            int currentElement = stack.pop();
            if (currentElement > kthLargest) {
                kthLargest = currentElement;
                count++;
            }
        }
        System.out.println(kthLargest-1);
   }


  public static void main(String args[]) {
        Stack < Integer > inputStack = new Stack < Integer > ();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            inputStack.add( in .nextInt());
        }

        if (inputStack.isEmpty()) {
            System.out.println("stack is empty");
            System.exit(0);
        }

        int k = in .nextInt();
        if (k > inputStack.size()) {
            System.out.println("invalid input");
            System.exit(0);
        }

        // This is the temporary stack
        findKthLargestNum(inputStack, k);

    }
}
