import java.util.Scanner;

class FindReversePositionSecondAlgo{
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      //Declare the array here
      int count = input.nextInt();  
      int[] array = new int[count];
      int key = 10;
       for (int i = 0; i < count; i++) {
           array[i] = input.nextInt();
       }
    
      
       for(int j=count-1; j>-1; j--){
           if(array[j] == key){
               System.out.println(count-j-1);
               break;
           }
       }
  }
}
