import java.util.Scanner;

 class SelectionSortImplementation {
     
    public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int[] array = new int[n];
        
        for(int i=0; i<n; i++){
            array[i] = input.nextInt();
        }
        
        SelectionSort(array);
        
        System.out.println("Sorted array: ");
        for(int i=0; i<n; i++){
            System.out.println(array[i]);
        }
        
    }
    
    public static void SelectionSort(int[] array) {
       int size = array.length;
       int min;
       
       for(int i=0; i<size-1; i++){
           min = i;
           for(int j=i+1; j<size; j++){
               if(array[j] < array[min]){
                   min = j;
                   
               }
           }
           int temp = array[i];
           array[i] = array[min];
           array[min] = temp;
       }
   }
}

