// Merge Sorted Arrays
// Description
// Write a function that merges two sorted arrays in descending order. 



// Input Format:

// Size of first sorted array
// Elements of first sorted array
// Size of second sorted array
// Elements of second sorted array
// Output Format:

// Print the merged sorted array in descending order


import java.util.Arrays;
import java.util.Scanner;

public class mergesTwoSortedArraysInDescendingOrder {

    public static int[] mergeBothInDescendingOrder(int[] sortedArray1, int[] sortedArray2){
                
        int final_array_len = sortedArray1.length + sortedArray2.length;
        int[] array3 = new int[final_array_len];
        
        for(int i=0; i<sortedArray1.length; i++ ){
            array3[i] = sortedArray1[i];
        }
        
        int count=0;
        for(int i=sortedArray1.length; i<final_array_len; i++ ){
            array3[i] = sortedArray2[count];
            count +=1;
        }
        return mergeSort(array3, 0, array3.length - 1);
    }

    public static int[] mergeSort(int[] numbers, int first, int last) {
        if(first < last){
            int mid = (first + last)/2;
            mergeSort(numbers, first, mid);
            mergeSort(numbers, mid+1, last);
            merge(numbers, first, mid, last);
        }
        return numbers;
    }

    private static int[] merge(int[] numbers, int i, int m, int j){
        
        int l = i; //inital index of first subarray
        int r = m+1; //inital index of second subarray
        int k = 0; //inital index of merged array
        
        int[] t = new int[numbers.length];
        
        while(l <= m && r <= j){
          
            // Decreasing order : if(numbers[l] >= numbers[r]) 
            if(numbers[l] >= numbers[r]){
                t[k] = numbers[l];
                k++;
                l++;
            } else{
                t[k] = numbers[r];
                k++;
                r++;
            }
        }
        
       // Copy the remaining elements on left half , if there are any
       while(l <= m){
            t[k] = numbers[l];
            k++;
            l++;
       }
       
       // Copy the remaining elements on right half , if there are any
       while(r <= j){
            t[k] = numbers[r];
            k++;
            r++;
       }
       
       // Copy the remaining elements from array t back the numbers array
        l = i;
        k = 0;
        
        while(l <= j){
            numbers[l] = t[k];
            l++;
            k++;
        }
        
        return numbers;
    }


    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int sortedArray1[] = getArrayInput(sizeArray1, scanner);
        int sizeArray2 = scanner.nextInt();
        int sortedArray2[] = getArrayInput(sizeArray2, scanner);
       
        int descendingMerge[]=mergeBothInDescendingOrder(sortedArray1, sortedArray2);
        
        for(int k=0; k<descendingMerge.length; k++){
            System.out.println(descendingMerge[k]);
        }
    }
    
    public static int[] getArrayInput(int sizeArray, Scanner scanner){
        
        int[] array = new int[sizeArray];
            
            for(int i = 0; i < sizeArray; i++)  
            {  
                array[i]=scanner.nextInt();  
            }
            
        return array;
    }
}
