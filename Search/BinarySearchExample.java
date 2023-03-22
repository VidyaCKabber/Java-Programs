//The array of integers has the following properties:

// With a known length N

// The array is sorted in an ascending order

// The array holds distinct integers (i.e. there are no repeating numbers)

// The array is 1-indexed, i.e. the first element is stored in A[1] (not A[0])

// Find the first positive integer M (where 1 <= M <= N) such that when M is used as the array index, the result from the array is the the integer M itself. i.e. A[M] = M

// Write a program to find M, if it exists, in O(log N) time. If M does not exist, please return NOT_FOUND


import java.util.Scanner;

class BinarySearchExample {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int[] array = new int[n+1];
        
        for(int i=1; i<=n; i++){
            array[i] = input.nextInt();
        }
        
        
        int res = findFixedPoint(array);
        if(res == -1){
            System.out.println("NOT_FOUND");
        } else{
            System.out.println(res);
        }
    }
    
    public static int findFixedPoint(int[] arr){
        int n = arr.length;
        
        int left = 1, right = n - 1, result = -1;
    
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == mid) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] > mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (result != -1) {
            return result;
        } else {
            return -1; // NOT_FOUND
        }
    }
}
