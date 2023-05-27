class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int key = 30;
        /*
            arr = input array
            low = 0
            high=
            key = arr.length-1
        */
        int index = search(arr, 0, arr.length-1, key);
        
        if(index != -1)
            System.out.println("Key found at index : " + index);
        else
            System.out.println("Element Not Found");
    }
    
    private static int search(int[] arr, int low, int high, int key){
        if(high < low){
            return -1;
        }
        int mid = (low + high) /2;
        
        if(key == arr[mid]){
            return mid;
        } else if(key > arr[mid]){
            return search(arr, mid+1, high, key);
        } else {
            return search(arr, low, mid-1, key);
        }
    }
}
