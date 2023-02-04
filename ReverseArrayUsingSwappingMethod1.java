import java.util.Arrays;

class ReverseArrayUsingSwappingMethod {
    public static void main(String[] args) {
        int arr[] = {10,2,1,5,3,8,9}; 
        int temp=0, i;
        int last = arr.length - 1;
        
        System.out.println(Arrays.toString(arr));
        for(i =0 ; i< arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[last];
            arr[last] = temp;
            last = last - 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
