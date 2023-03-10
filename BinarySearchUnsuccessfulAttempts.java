import java.util.*;

class BinarySearchUnsuccessfulAttempts {
   public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
       int middle, count=0;
       int left = 0;
       int right = inputArr.length - 1;
       middle = (left+right)/2;
       
        while(left <= right){
            
            if(inputArr[middle] == key){
                return count;
            } else if (inputArr[middle] > key){
                right = middle - 1;
            } else {
                right = middle + 1;
            }
            count++;
        }
        return -1;
    }
  
   public static void main(String args[] ) throws Exception {
       Source bs = new Source();
       Scanner scanner = new Scanner(System.in);
       int size = scanner.nextInt();
       int array[] = new int[size];
       for (int i = 0; i < size; i++) {
           array[i] = scanner.nextInt();
       }
       int key = scanner.nextInt();
       System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
   }
}
