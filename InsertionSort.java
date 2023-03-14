class InsertionSort {
    public static void main(String[] args) {
        int[] array = {4, 5, 8, 2, 1};
        
         for(int i=1; i<array.length; i++){
            int v = array[i]; 
            int j = i; 
            
            while(j>=1 && array[j-1]>v){   
                array[j] = array[j-1]; 
                j--; 
            }
            array[j]=v; 
        }
        
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
