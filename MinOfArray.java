// Description
// Write the programming logic in order to find the minimum element of the provided array.
// (array is given in the stub)

import java.util.Scanner;

class Source {
   public static void main(String[] args) {
       int min;
       int[] array = {156, 171, 260, 95, 244, 296, 137, 180, 198, 61, 70, 283, 276, 55,
       + 100, 59, 278, 191, 109, 110, 158, 206, 77, 279, 53, 117, 217, 214, 107, 99, 222, 
       + 275, 179, 213, 199, 139, 174, 286, 176, 155, 237, 256, 251, 187, 249, 215, 211, 113, 
       + 144, 50, 148, 49, 170, 236, 219, 106, 71, 263, 145, 231, 190, 165, 239, 41, 177, 297,
       + 184, 193, 287, 202, 161, 189, 79, 232, 154, 153, 208, 72, 143, 300, 233, 124, 75,
       + 277, 63, 130, 86, 242, 203, 116, 196, 289, 146, 273, 268, 56, 104, 173, 134, 194};
       
       // Write logic here
       min = array[0];
       
       for(int i=0; i<array.length; i++){
           if (array[i] < min){
               min = array[i];
           }
       }
       System.out.println("Minimum value: " + min);
   }
}
