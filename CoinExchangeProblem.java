// Coin Exchange Problem
// Description
// Problem Statement :-

// Given an unlimited supply for few denominations [1,5,7,10] and an amount n, your code should output the number of ways the amount can be paid from the given denominations. 



// The input should have the amount n, the amount for which you have to find the number of ways.
// The output should print the number of ways the amount can be paid. 


import java.util.Scanner;
public class CoinExchangeProblem {
  	public static int count(int[] d, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for (int coin : d) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i-coin];
            }
        }
        return dp[amount];
    }
   
      public static void main(String args[]) {
        int[] d = {1,5,7,10};
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        System.out.println(count(d, amount));
    	scan.close();
    }
}
