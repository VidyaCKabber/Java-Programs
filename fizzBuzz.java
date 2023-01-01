// Functions
// Description
// Write a function called ‘fizzBuzz’, that takes in an array of integers, and for each number in the array, if the number is —
// 1) a multiple of three, it prints ‘Fizz’ (instead of the number).
// 2) a multiple of five, it prints ‘Buzz’ (instead of the number).
// 3) a multiple of both three and five, it prints ‘FizzBuzz’ (instead of the number).
// 4) otherwise, it simply prints the number.

// For example, if the array is - 2 3 5 8 12 15 16
// The output would be - 2 Fizz Buzz 8 Fizz FizzBuzz 16

// Input:
// No input required
// Output:
// 1 2 34 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz

// Note: Please print the result on the same line, with each output being separated by a space, such as:
// 1 2 34 Buzz Fizz  ...
// and not on different lines, such as:
// 1
// 2
// 34
// Buzz
// Fizz
// ...

class Source {
  public static void main(String args[]) {
    int[] numbers = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
    fizzBuzz(numbers);
  }
  
  public static void fizzBuzz(int[] numbers) {
      for(int i=0; i < numbers.length; i++){
          if(numbers[i] % 3 == 0){
              if(numbers[i] % 5 == 0){
                System.out.print("FizzBuzz"+" ");
              } else{
                System.out.print("Fizz"+" ");  
              }
          } else if(numbers[i] % 5 == 0){
              System.out.print("Buzz"+" ");  
          } else{
              System.out.print(numbers[i]+" ");  
          }
        }
    }
}
