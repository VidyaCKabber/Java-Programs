// Match Locks and Keys
// Description
// Suppose you are given the array of locks and keys. Write the program to print the key and its corresponding lock in the order of the keys present in the array.



// Note:

// You should not compare any lock with any other lock; similarly, you should not compare any key with any other key. 
// The size of the array of locks and keys is the same.


// Input: The input will be in the following format:

// The first line will be ‘n’, indicating the size of the array of keys.
// The next line will be ‘n’ space-separated characters indicating keys.
// The next line will be ‘n’ space-separated characters indicating locks.


// Output: The output should be in the following format:

// Print each key and its corresponding lock separated by space in a new line in the same order of keys. 
// If any of the locks corresponding to the key is not present, then print ‘Not possible’. 




// Sample input-1:

// 5
// # % ! @ $
// ! # $ % @


// Sample output-1:

// # #
// % %
// ! !
// @ @
// $ $
// Here, the input 5 indicates the size of the locks and keys array. The next line in the input represents the locks array with five elements. The third line in the input represents the keys array with five elements. The output contains space-separated key-lock pairs in order in which keys are present, that is, # is the first element in key array, So, # is searched for and printed first, and the same process is followed for other keys.



// Sample input-2:

// 5
// # % ! @ $
// ! # $ % 1


// Sample output-2:

// Not possible
// Here, the input 5 indicates the size of the locks and keys array. The next line in input represents the locks array with five elements. The third line in the input represents the keys array with five elements. The output is ‘Not possible’, as the key @ has no matching lock in the locks array.

import java.util.*;

class MatchLocksAndKeys {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        
        HashSet<Character> hashset = new HashSet<Character>();

        // get the number of keys
        int n = in.nextInt();

        char keys[] = new char[n];
        char locks[] = new char[n];

        // store all the keys to the array "keys"
        for (int i = 0; i < n; i++) {
            keys[i] = in.next(".").charAt(0);
            hashset.add(keys[i]);
        }
        
        in.nextLine();
        
        //store all the locks to the array "locks"
        for (int i = 0; i < n; i++) {
            locks[i] = in.next(".").charAt(0);
        }
            
        boolean flag = true;
        //write your code here
        for (int j = 0; j < n; j++) {
            if(!hashset.contains(locks[j])){
                flag = false;
                break;
            }
        }
        
        if(flag == true){
            for (int j = 0; j < n; j++) {
                System.out.println(keys[j]+" "+keys[j]);
            }
        } else{
            System.out.println("Not possible");
        }
    }
}

