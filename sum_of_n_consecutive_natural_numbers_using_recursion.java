import java.util.Scanner;
class Source{
   public static int sum(int n){
    if(n < 0){
        return 0;
    } else {
        return n + sum(n-1);
    }
  }
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       if (n>0){
           int value = Source.sum(n);
           System.out.print(value);
       }
       else{
            System.out.println("Enter a natural number");
       }
   }
}
