// Anagram of key value pairs of a HashMap
// Description
// You are given a HashMap with n number of keys and values. You need to print key-value pairs that are an anagrams of each other in the dictionary order of keys (alphabetical order based on the first letter of the word). An anagram is a word, phrase or name that is formed by rearranging the letters of another. 



// Example:

// Map = {rasp spar, dog cat}

// Output: 
// rasp : spar
// Here spar is formed from rasp.



// Input: The input will be in the following format:
// The first line should be the number of elements present in the map.
// Next, n lines contain the key-value pairs.
// Output:

// All the key-value pairs that are an anagram of each other should be printed in the following format:

// Key1: Value1
// Key2: Value2
// Note: If there is no such key-value pair anagram of each other, then the output should be false.



// Sample Case-1:

// Input:

// 3
// BAT TAB
// CAT DOG
// EAT TEA
// Output:

// BAT:TAB
// EAT:TEA
// Here, 3 represents the number of key-value pairs present in the map. The next three lines in the input represent the key-value pairs. The output is those key-value pairs that are anagrams.



// Sample Case-2:

// Input:

// 2
// A B
// C D
// Output:

// false
// Here, 2 represents the number of key-value pairs present in the map. The next two lines in the input represent the key-value pairs. The output is false, which represents that no anagrams are present in the input.



import java.util.*;
public class Anagram{
	//Method to check if two strings are anagram of each other or not
	public static boolean check(String str1, String str2){
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		str1 = new String(ch1);
		str2 = new String(ch2);
		
		if(str1.contains(str2)){
		    return true;
		} else {
		    return false;
		}
	}
	
	public static void main(String[] x){
		Map<String,String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String key;
		String value;
		for(int i = 1; i <= num; i++){
			key = sc.next();
			value = sc.next();
			map.put(key,value);
		}
		
		Set<String> keys = map.keySet();
        int count = 0;
		for(String k : keys){
		    boolean res = check(k, map.get(k));
		    if(res == true){
		        count++;
		        System.out.println(k+" : "+map.get(k));
		    }
		} if(count == 0){
		    System.out.println(false);
		}
	}
}
