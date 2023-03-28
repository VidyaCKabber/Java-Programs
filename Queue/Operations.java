import java.util.Queue;
import java.util.LinkedList;

class Operations {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        
        // enque
        queue.add(5); //this will throw exception if Queue is already full
        queue.offer(15); // doesn't throw exception
        System.out.println(queue);
        //Peek
        queue.element(); //returns the element which was added first and still present. Throws exception if the queue is empty
        System.out.println(queue);
        queue.peek(); // Same thing as above. Returns null instead of exeption if empty
        
        //Deque
        queue.remove(); // this removes the element added in FIFO order. If the Queue is empty, this will throw error
        System.out.println(queue);
        queue.poll(); // same as remove but will not throuw exception. Return null
        
        System.out.println(queue);
    }
}
