import java.util.Scanner;

public class removeSpecificElementFromArray {
    public static void main(String[] args){
        System.out.println("Enter number of array elements");
        Scanner  input = new Scanner(System.in);
        int arrayLength = input.nextInt();
        boolean isRemoveElementFound = false;

        int arr[] = new int[arrayLength];
        System.out.println("Enter array elements one by one : ");

        for(int i=0; i < arrayLength; i++){
            Scanner input1 = new Scanner(System.in);
            arr[i] = input1.nextInt();
        }

        System.out.println("Enter element to remove from array : ");
        Scanner input2 = new Scanner(System.in);
        int removeElement = input2.nextInt();

        for(int j=0; j < arrayLength; j++){
            if(removeElement == arr[j]) {
                isRemoveElementFound = true;
                for(int k=j; k < arrayLength - 1; k++){
                    arr[k] = arr[k+1];
                }
                arrayLength -= 1;
                break;
            }
        }

        if(isRemoveElementFound) {
            System.out.println("Output array : ");
            for (int j = 0; j < arrayLength; j++) {
                System.out.println(arr[j]);
            }
        } else {
            System.out.println(removeElement + " Not found in the input array");
        }
    }
}
