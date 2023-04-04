//First Unique Character
// Description
// You will be given a string, and you have to print the first unique character of the string, i.e., the non-repeating character of the string.

// Note: 

// The string may contain duplicates.
// If there is no unique character, then print -1.


// Input: The input will be in the following format:

// The first line will be a string.
// Output: The output should be in the following format:

// Print the first unique character of the string or -1 if no unique character is found.


// Sample Input-1:

// abcdabdef


// Sample output-1:

// c
// The input is a string "abcdabdef". The output is character c from the input string, as c is the only character that is not repeated in the string.



// Sample input-2:

// aabb


// Sample output-2:

// -1
// The input is a string "aabb". The output is -1, as there is no non-repeating character present in the input string.




import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;

public class FirstUniqueCharacter {

    public static void main(String arg[]) {

        Scanner in = new Scanner(System.in);
        HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
        //storing the input string to String variable "str"
        String str = in.nextLine();
        
        for(int i=0; i< str.length() ; i++){
            char c = str.charAt(i);
            //System.out.println(str.charAt(i));
            
            if(! hashmap.containsKey(c)){
                hashmap.put(str.charAt(i), 1);
            } else{
                int count = hashmap.get(c) + 1;
                hashmap.put(str.charAt(i), count);
            }
        }
        boolean isUniqueCharFound = false;
        char UniqueChar = '0';
        for(Entry<Character, Integer> entry: hashmap.entrySet()) {
            if(entry.getValue() == 1){
                isUniqueCharFound = true;
                UniqueChar = entry.getKey();
                break;
            }
        }
        if(isUniqueCharFound == true){
            System.out.println(UniqueChar);
        } else{
            System.out.println(-1);
        }
    }
}
