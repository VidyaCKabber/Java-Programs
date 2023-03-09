public class LinearSearch {

    public static void main(String[] args){
        int[] arr = {1, 2, 78, 7, 89};
        int searchNum = 7;
        int resp = LinearSearchAlgo(arr, searchNum);

        if(resp == 1) {
            System.out.println(searchNum +" found in given array");
        } else {
            System.out.println(searchNum +" not found in given array");
        }
    }

    public static int LinearSearchAlgo(int[] array, int num){
        int size = array.length;

        for(int i=0; i<size; i++) {
            if(array[i] == num){
                return 1;
            }
        }
        return -1;
    }
}
