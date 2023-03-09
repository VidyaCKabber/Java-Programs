import java.util.Scanner;

class findReversePosition{
    public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      //Declare the array here
      int count = input.nextInt();  
      int[] array = new int[count];
      
       for (int i = 0; i < count; i++) {
           array[i] = input.nextInt();
       }
       
       int k;
       for(int l=0; l<count/2; l++){
           k = array[l];
           array[l] = array[count - l - 1];
           array[count - l - 1] = k;
       }
       
       int key = input.nextInt();
       input.close();
      
       for(int j=0; j<count; j++){
           if(array[j] == key){
               System.out.println(j);
               break;
           }
       }
  }
}
