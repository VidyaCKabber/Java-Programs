import java.util.Scanner;
 class InsertionsortImplementation {

    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        
        for(int i=0; i<n; i++){
            array[i] = input.nextInt();
        }
        InsertionSort(array, n);
    }

    public static void InsertionSort(int[] array, int size){
        for(int i=1; i<size; i++){
                int v = array[i]; 
                int j = i; 
                
                // Ascending order array[j-1]>v and descending order array[j-1]<v
                while(j>=1 && array[j-1]>v){   
                    array[j] = array[j-1]; 
                    j--; 
                }
                array[j]=v; 
            }
            for(int i=0; i<size; i++){
                System.out.println(array[i]);
            }
        }
    }
