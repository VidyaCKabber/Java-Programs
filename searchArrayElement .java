import java.util.Scanner;
public class searchArrayElement  {
    public static void main(String[] args){
        System.out.println("Enter number of array elements");
        Scanner  input = new Scanner(System.in);
        int arrayLength = input.nextInt();
        boolean isElementFound = false;

        int arr[] = new int[arrayLength];
        System.out.println("Enter array elements one by one : ");

        for(int i=0; i < arrayLength; i++){
            Scanner input1 = new Scanner(System.in);
            arr[i] = input1.nextInt();
        }

        System.out.println("Enter element to search it in given array : ");
        Scanner input2 = new Scanner(System.in);
        int arrElement = input2.nextInt();

        for(int j=0; j < arrayLength; j++){
            if(arrElement == arr[j]) {
                isElementFound = true;
                break;
            }
        }
        
        if(isElementFound) {
            System.out.println(arrElement+" found in the given array");
        } else {
            System.out.println(arrElement + " dosen't found in the input array");
        
