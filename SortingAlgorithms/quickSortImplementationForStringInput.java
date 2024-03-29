import java.util.Scanner;

 class quickSortImplementationForStringInput {
     
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        String ar[] = new String[n];
        
        input.nextLine();
        for(int i=0; i<n; i++){
            ar[i] = input.nextLine();
        }
        
        quickSort(ar, 0, ar.length - 1);
        printArray(ar);
    }

   public static void quickSort(String array[], int left, int right) {
       if (left < right) {
           int position = partition(array, left, right);
           quickSort(array, left, position - 1);
           quickSort(array, position + 1, right);
       }
   }
   
   public static int partition(String[] ar, int start, int end) {
        int pivot = ar[end].length();
        int i = start;
        for (int j = start; j < end; j++) {
            if (ar[j].length() <= pivot) {
                String temp1 = ar[j];
                ar[j] = ar[i];
                ar[i] = temp1;
                i++;
            }
        }
        String temp2 = ar[i];
        ar[i] = ar[end];
        ar[end] = temp2;

        return i;
    }

    static void printArray(String arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]);
    }
 }
    
