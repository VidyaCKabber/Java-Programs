// Sort Nearly Sorted Array
// Description
// Given a k-sorted array of n elements, where each element is at most k steps away from its target position as it would have been in an array that is sorted in ascending order. Write a program to sort the array in O(n log k) time.

 

// For example, an element at index i in an array that was sorted in ascending order can be found at indexes i - 3, i - 2, i - 1, i, i + 1, i + 2 and i + 3 in the given k-sorted array.

 

 

// Input Format:

// The first line contains an integer ‘N’ as the size of the array.

// The second line contains an integer ‘K’ representing the maximum number of steps that each element can deviate from its target position as it would have been in an array that is sorted in ascending order.

// The third line contains the elements of the k-sorted array.

 

// Output Format:

// The output contains the elements of the array that is sorted in ascending order.

 

// Sample Test Cases:

// Input:

// 7

// 3

// 7 6 4 3 9 11 10

 

// Output:

// 3 4 6 7 9 10 11

 



// Input:

// 7

// 3

// 6 5 3 2 8 10 9

 

// Output:

// 2 3 5 6 8 9 10


import java.util.*;

public class Source {
    private static void sortArray(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int index = 0;

        // Build the initial min heap with the first k+1 elements
        for (; index <= Math.min(k, arr.length - 1); index++) {
            minHeap.offer(arr[index]);
        }

        // Process the remaining elements
        for (; index < arr.length; index++) {
            arr[index - k - 1] = minHeap.poll(); // Retrieve the smallest element from the heap
            minHeap.offer(arr[index]); // Add the current element to the heap
        }

        // Retrieve the remaining elements from the heap
        while (!minHeap.isEmpty()) {
            arr[index - k - 1] = minHeap.poll();
            index++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Size of the array
        int k = sc.nextInt(); // Maximum number of steps
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sortArray(arr, k);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}



