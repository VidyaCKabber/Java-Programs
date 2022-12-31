import java.util.Arrays;

class Source {
  public static void main(String[] args) {
    int[] array = {29,34,12,45,56,02,43, 19};
    
    Arrays.sort(array);
    // write code to use the Array function
          
    for(int i=0; i<array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
