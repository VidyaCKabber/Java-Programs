import java.util.Scanner;
// Assuming need to find out index of first occurrence of the element is there are duplicates in the array.

public class findElementIndexInArray  {
    public static void main(String[] args){
        System.out.println("Enter number of array elements");
        Scanner  input = new Scanner(System.in);
        int arrayLength = input.nextInt();
        int searchElementIndex = -1;

        int arr[] = new int[arrayLength];
        System.out.println("Enter array elements one by one : ");

        for(int i=0; i < arrayLength; i++){
            Scanner input1 = new Scanner(System.in);
            arr[i] = input1.nextInt();
        }

        System.out.println("Enter element to find it's index in array : ");
        Scanner input2 = new Scanner(System.in);
        int arrElement = input2.nextInt();

        for(int j=0; j < arrayLength; j++){
            if(arrElement == arr[j]) {
                searchElementIndex = j;
                break;
            }
        }

        if(searchElementIndex != -1) {
            System.out.println("Index of "+arrElement+" in the given array is: "+searchElementIndex);
        } else {
            System.out.println(arrElement + " Not found in the input array");
        }
    }
}
