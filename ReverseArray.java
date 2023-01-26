import java.util.*;

public class ReverseArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to reverse the array
    static void reverseArray(int[] arr) {
        int[] arr1 = new int[arr.length];
        int index = 0;
        for(int i=arr.length-1; i>=0; i--){
            arr1[index++] = arr[i];
        }
        arr = arr1.clone();
    }
}
