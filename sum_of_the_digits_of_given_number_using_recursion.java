 import java.util.Scanner;

class Source{
    static int add = 0, temp = 0;
 public static int sum(int n) {
    if(n == 0){
        return 0;
    } else {
        temp = n % 10;
        add = add + temp;
        sum(n/10);
        return add;
    }
 }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
    System.out.println(sum(num));
   } 
}
