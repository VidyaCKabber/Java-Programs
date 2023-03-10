class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 7, 9, 10};
        
        int num = 10;
        int l = 0;
        int r = array.length - 1;
        
        int res = BinarySearch(array, l, r, num);
        
        if(res == num){
            System.out.println(num+ " found in given array");
        } else{
            System.out.println(num+ " not found in given array");
        }
    }
    
    public static int BinarySearch(int[] arr, int left, int right, int num){
        int middle;
        while(left <= right){
            middle = (left+right)/2;
            if(arr[middle] == num){
                return num;
            } else if (arr[middle] > num){
                right = middle - 1;
            } else {
                right = middle + 1;
            }
        }
        return -1;
    }
}
