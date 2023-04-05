import java.util.*;

class DistinctConsecutiveIntegers  {
    public static void main(String[] args) {
      int[] array =  {5, 8, 4, 4, 7, 6, 2, 6, 7, 3};
       int count = 0,n = array.length;
    
       HashSet<Integer> hashSet = new HashSet<Integer>();
     
       for (int i = 0; i < n; i++)
           hashSet.add(array[i]);
    
       int currentElement = array[0];
    
       while (hashSet.contains(currentElement) == true) {
           count++;
           currentElement--;
       }
       System.out.println(count);
    }
}

// The method provided above prints the number of distinct consecutive integers present in the ‘hashSet’ that are less than or equal to the first element of the ‘array’, by following the steps given below.

// Store all the ‘array’ elements to the ‘hashSet’.

// Get the first element of the ‘array’ and store it to the ‘currentElement’ (here, ‘currentElement’ is an integer variable).

// Initialise an integer variable ‘count’ as 0 (count is the variable which stores the number of distinct consecutive integers present in the ‘hashSet’ that are less than or equal to the first element of the ‘array’).

// If the ‘currentElement’ is present in the ‘hashSet’, then increment the count by 1 and decrement the ‘currentElement’” by 1.

// Repeat the above step until the ‘currentElement’ is present in the ‘hashSet’.

// The consecutive integers in the ‘hashSet’ that are less than or equal to the first element ‘5’ of the ‘array’ are {5, 4, 3, 2}. Therefore, the answer is 4.
