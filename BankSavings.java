/* A bank has decided to renew its policy; according to the new policy, you can only own a savings account with minimum savings of Rs.1000. Construct a class ‘SavingAmount’ with only one integer instance variable ‘saving’. The class will have the following methods in it: 
A setter method that will take an integer as a parameter and set the value of savings equal to that of the integer .
A getter method that will return the saving .
An increment method that will increase the savings by Rs.1000 .
A decrement method that will decrease the savings by Rs.100 .
A method to check the savings of a person say 'checkSavings'. If the savings amount is greater than or equal to Rs.1000, print “Congratulations! You have saved a good amount”. If the amount is less than Rs.1000 and greater than or equal to 0, print “Insufficient saving!”. If the savings amount is less than 0, print “You are in debt”.
*/

import java.util.*;

class SavingAmount {
//write your code here
 private int saving = 1000;
 
 public void setInitialSaving(int savings){
     this.saving = savings;
 }
 
 public int getCurrentSaving(){
     return this.saving;
 }
 
 public void decrementSaving(){
     this.saving = this.saving - 100;
 }
 
 public void incrementSaving(){
     this.saving = this.saving + 1000;
 }
 
 public void checkSavings(){
     if(this.saving >= 1000){
        System.out.println("Congratulations! You have saved a good amount"); 
     } else if(this.saving >= 0 && this.saving < 1000){
        System.out.println("Insufficient saving!");  
     } else{
        System.out.println("You are in debt");
     }
   }     
}

public class BankSavings {
    public static void main(String[] args) {

        SavingAmount obj = new SavingAmount();
        Scanner in = new Scanner(System.in);
        obj.setInitialSaving(in.nextInt());
        obj.decrementSaving();
        obj.incrementSaving();
        obj.checkSavings();
        System.out.println("Your current savings are Rs " + obj.getCurrentSaving());
    }
}


