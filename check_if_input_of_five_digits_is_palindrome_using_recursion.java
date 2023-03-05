import java.util.Scanner;

class Source {
    
   static int end = 4, count = 0;
   public static boolean palindrome(int[] num, int index) {
   
    if (index < 2){
        if(num[index] == num[end]){
            end -= 1;
            count += 1;
            palindrome(num, index+1);
        } 
    } 
    if(count == 2) {
        return true;
    } 
    return false;
  }

   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int num[] = new int[5];
       for(int i=0; i< 5;i++)
           num[i] = sc.nextInt();
       boolean answer = palindrome(num, 0);
       System.out.println(answer);
   }
}
