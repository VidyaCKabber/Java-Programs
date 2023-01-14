public class minMaxValueOfArray {
    public static void main(String[] args){
        int arr[] = {1, 56, 7, 28, 97, 96, 12, 99};
        int minValue = arr[0];
        int maxValue = arr[0];
        for(int i = 1; i < arr.length; i++ ){
            if(minValue > arr[i]){
                minValue = arr[i];
            }

            if(maxValue < arr[i]){
                maxValue = arr[i];
            }

        }
        System.out.println("Min Value of the array"+ minValue);
        System.out.println("Max Value of the array"+ maxValue);
    }
}
