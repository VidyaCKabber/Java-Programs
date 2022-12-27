import java.util.Scanner;

class SwitchExample{
    public static void main(String[] args){
       int drink;
       Scanner input = new Scanner(System.in);
       drink = input.nextInt();

       switch(drink){
         case 1:
           System.out.println("Preparing Cappuccino");
           break;
        case 2:
           System.out.println("Preparing Espresso");
           break;
       case 3:
           System.out.println("Preparing Latte");
           break;
      case 4:
           System.out.println("Preparing Milk");
           break;
      default:
           System.out.println("Drink not available");
     }
