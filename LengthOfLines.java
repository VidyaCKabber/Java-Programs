// Description
// Find the total sum of length of lines. A line is defined with 2 points A and B on the number line. For example if A = -3 and B = 10, the length of the line is 13. This is because the distance between -3 and 10 on the number line is 13 units (10 -(-3) = 13)
// Similarly, if A = 9 and B = 5, the length of line shall be 4 units as the distance between 9 and 5 on the number line is 4 units( 9 - 5 = 4)

// Input - There will be 2 lines and each line will have number A & B integers separated by space.

// Output - This should return the sum of length of 2 lines given as input by the user.

// Sample Input:
// 5 9
// -10 3

// Expected Output:
// 17

// Explanation:
// First line represents first line's coordinates i.e. A = 5, B = 9.
// Second line represents second line's coordinates i.e. A = -10, B = 3.
 
// Length of first line = 4, length of second line is 13. Hence output is 17.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Source{

    // DO NOT CHANGE THIS MAIN METHOD!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLineCoordinates = br.readLine().split(" ");
        int a1 = Integer.parseInt(firstLineCoordinates[0]);
        int b1 = Integer.parseInt(firstLineCoordinates[1]);

        String[] secondLineCoordinates = br.readLine().split(" ");
        int a2 = Integer.parseInt(secondLineCoordinates[0]);
        int b2 = Integer.parseInt(secondLineCoordinates[1]);

        Line firstLine = new Line(a1, b1);
        Line secondLine = new Line(a2, b2);

        int totalSumOfLines = getTotalSumOfLines(firstLine, secondLine);
        System.out.println(totalSumOfLines);

        br.close();
    }

    private static int getTotalSumOfLines(Line firstLine, Line secondLine) {
        
        int fa = firstLine.getA();
        int fb = firstLine.getB();
        int fnegativeValue;

        int sa = secondLine.getA();
        int sb = secondLine.getB();
        int result;

        result = ( ( fa > fb ? (fa - fb) : (fb - fa) ) ) + ( sa > sb ? (sa - sb) : (sb - sa) );
         
        return result;
    }

    public static class Line {
        private int a;
        private int b;

        public Line(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }
    }
}
