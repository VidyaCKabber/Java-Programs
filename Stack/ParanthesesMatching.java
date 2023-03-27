import java.util.Scanner;
import java.util.*;

public class ParanthesesMatching
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String data = input.nextLine();
		System.out.println(match(data));
	}
	
	public static boolean match(String data){
	    Stack<Character> s = new Stack<Character>();
	    
	    for(char c : data.toCharArray()){
	        
	        if(c == '(' || c == '{'){
	            s.push(c);
	        } else if(c == ')'){
	            if(! s.isEmpty()){
	                if(s.peek() == '('){
	                    s.pop();
	                } else {
	                    return false;
	                }
	            }
	        }else if(c == '}'){
	            if(! s.isEmpty()){
	                if(s.peek() == '{'){
	                    s.pop();
	                } else {
	                    return false;
	                }
	            }
	        } else{
	            new Exception("Invalid");
	        }
	    }
	    
	    if(s.isEmpty()){
	        return true;
	    } else{
	        return false;
	    }
	}
}
