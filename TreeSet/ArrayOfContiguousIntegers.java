Check Array of Contiguous Integers
// Description
// You will be given the array of ‘n’ integers, and you have to print “true” if the distinct integers of the given n integers can form a set of contiguous integers. Otherwise, print “false”.

// Note: The given array of integers may contain duplicates.





// Input: The input will be in the following format:

// The first line will be ‘n’, indicating the size of the input array.
// The next line will be ‘n’ space-separated integers, indicating the elements of the array.
// Output: The output should be in the following format:

// Print 'true' if the distinct integers of the given n integers can form a set of contiguous integers. Otherwise, print 'false'.
// Note: If the array is empty, then assume that the array did not contain any distinct integers that can form contiguous integers.

 

// Sample input-1:

// 10
// 5 8 4 4 7 6 2 6 7 3


// Sample output-1:

// true
// The first line of input 10 represents the number of integers that the user will input. The next line in the input is 10 space-separated integers. The output here is true because if we remove all the duplicate integers, the array looks like {5,8,4,7,6,2,3}, which can be rearranged to the array of the contiguous integers {2,3,4,5,6,7,8}.



// Sample input-2:

// 5
// 1 2 7 4 5


// Sample output-2:

// false
// The first line of input 5 represents the number of integers that the user will input. The next line in the input is 5 space-separated integers. The output here is false, as the input integers cannot be arranged into contiguous integers.




import java.util.*;

class ArrayOfContiguousIntegers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<Integer> tSet = new TreeSet<Integer>();
        int n;
        n = in.nextInt();

        //storing the elements to the array
        for (int i = 0; i < n; i++) {
            tSet.add(in.nextInt());
        }
        int counter = tSet.first();
        
        for(Integer value : tSet ){
            if(value == counter){
                counter++;
            }
        }
        counter--;
        int lastvalue = tSet.last();
        if(lastvalue == counter){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
