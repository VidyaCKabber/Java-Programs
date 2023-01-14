public class reverseArray {
    public static void main(String[] args){
        int arr[] = {1, 56, 7, 28, 97, 96, 12, 99};
        int arrLength = arr.length;
        int reversedArray[] = new int[arrLength];

        System.out.println("Initial array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            arrLength -= 1;
            reversedArray[i] = arr[arrLength];
        }

        System.out.println("\n\nReversed array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(reversedArray[i] + " ");
        }

    }
}
