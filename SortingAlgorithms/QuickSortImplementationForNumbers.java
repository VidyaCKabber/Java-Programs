import java.util.Scanner;

class QuickSortImplementationForNumbers {
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int ar[] = new int[n];
        
        for(int i=0; i<n; i++){
            ar[i] = input.nextInt();
        }
        
        quickSort(ar, 0, ar.length - 1);
        printArray(ar);
    }

   public static void quickSort(int array[], int left, int right) {
       if (left < right) {
           int position = partition(array, left, right);
           quickSort(array, left, position - 1);
           quickSort(array, position + 1, right);
       }
   }
   
   public static int partition(int[] ar, int start, int end) {
        int pivot = ar[end];
        int i = start;
        for (int j = start; j < end; j++) {
            //Increasing order: ar[j] <= pivot 
            //Decreasing order: ar[j] >= pivot 
            if (ar[j] <= pivot) {
                int temp1 = ar[j];
                ar[j] = ar[i];
                ar[i] = temp1;
                i++;
            }
        }
        int temp2 = ar[i];
        ar[i] = ar[end];
        ar[end] = temp2;

        return i;
    }
    
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]);
    }
 }
    
