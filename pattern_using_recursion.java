// *  
// * *  
// * * *  
// * * * *  
// * * * * *

import java.lang.String;
import java.util.Scanner;

public class Source{
    static int i = 0;
    // function to print the required pattern
    public static void func(int n) {
        if(n < 1){
            System.out.println("");
        }
        else {
            for(int j=0; j<= i; j++){
                System.out.print("*");
            }
            System.out.println("");
            i +=1;
            func(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        func(n);
    }

}

