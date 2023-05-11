
// Description
// Given an array of integers, find the most frequent element in the array. If multiple elements appear a maximum number of times, print any one of them. Return -1 in case there are no elements.



// Input Format:

// The first line contains the size of the array, N.

// The second line contains the elements of the array.

 

// Output Format:

// The output contains the most frequent element in the array.

 

// Sample Test Cases:

// Input:

// 8

// 1 3 2 5 2 1 9 2

 

// Output:

// 2

 

// Input:

// 8

// 10 15 12 11 13 12 11 11

 

// Output:

// 11

import java.util.*;

public class MostFrequentElement {

    public static int mostFrequentElement(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        HashMap<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        int mostFrequentElement = -1;

        for (int num : arr) {
            int count = countMap.getOrDefault(num, 0) + 1;
            countMap.put(num, count);

            if (count > maxCount) {
                maxCount = count;
                mostFrequentElement = num;
            }
        }

        return mostFrequentElement;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Size of the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = mostFrequentElement(arr);
        System.out.println(result);
    }
}
