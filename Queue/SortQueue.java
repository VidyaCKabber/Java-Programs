// Sort the queue
// Description
// You are given a queue with n integers. You need to sort the queue in ascending order such that the minimum value is at the head of the queue. The expected input is the the number of elements and the elements of the queue, you need to print the elements in the queue after they are sorted in ascending order.

// Example: 
// Queue (head -> tail)= [6, 12, 3, 4, 5, 1, 7, 8, 10, 9, 11, 2]
// Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

// Input Format:
// 12
// 6 12 3 4 5 1 7 8 10 9 11 2

import java.util.*;

public class SortQueue {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        sort(queue);
    }

    static void sort(Queue<Integer> queue) {
        
        for(int i = 1; i <= queue.size(); i++)
		{
			int min_index = minIndex(queue,queue.size() - i);
			insertMinToRear(queue, min_index);
		}
		System.out.print(queue);
    }
    
    public static void insertMinToRear(Queue<Integer> queue,
											int min_index){
		int min_value = 0;
		int s = queue.size();
		for (int i = 0; i < s; i++)
		{
		int current = queue.peek();
		queue.poll();
		if (i != min_index)
			queue.add(current);
		else
			min_value = current;
		}
		queue.add(min_value);
	}
	
	public static int minIndex(Queue<Integer> queue,
									int sortIndex){
	int min_index = -1;
	int min_value = Integer.MAX_VALUE;
	int s = queue.size();
	for (int i = 0; i < s; i++){
		int current = queue.peek();
		queue.poll();
		
		if (current <= min_value && i <= sortIndex){
			min_index = i;
			min_value = current;
		}
		queue.add(current);
    	}
    	return min_index;
    }
}
