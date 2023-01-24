// Given below is a Rectangle class consisting of an upper left coordinate and a lower right coordinate.

// class Rectangle {
//    int upperLeftX;
//    int upperLeftY;
//    int lowerRightX;
//    int lowerRightY;
// }
// Since the upper left coordinate and lower right coordinate comprise of points, how would you modify the definition of the Rectangle class to include these points in your class?

// Hint: You can create a Point class to store the x and y coordinates of the upper left and lower right points and use composition to include the upper left and lower right points inside the Rectangle class, as objects of the Point class.

class Rectangle(){
     private Point point;
     private float length;
     private float width;

     Rectangle(float length, float width, Point point){
       this.length = length;
       this.width = width;
       this.point = point;
   }
}
class Point{
      private int upperLeftX;
      private int upperLeftY;
      private int lowerRightX;
      private int lowerRightY
      Point(int upperLeftX, int upperLeftY, int lowerRightX, int lowerRightY){
            this.upperLeftX = upperLeftX;
            this.upperLeftY = upperLeftY;
            this.lowerRightX = lowerRightX;
            this.lowerRightY = lowerRightY;
      }
}

public class Test {
    public static void main(String[] args){
      Point p = new Point(1, 2, 3, 4);
      Rectangle rectangle = new Rectangle(2.5, 6, p);
    }
}
