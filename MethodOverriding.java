//Given below is the code for the Rectangle class.

//Define a new class named Square and override the methods area() and perimeter() to calculate the area and perimeter of a square.

class MethodOverriding {
    public static void main(String[] args) {
        Square s = new Square(4, 4);
        s.area();
        s.perimeter();
    }
}

class Rectangle {
   private double width;
   private double height;

   Rectangle(double width, double height){
       this.width = width;
       this.height = height;
   }

   public double getWidth() {
      return width;
   }

   public double getHeight() {
      return height;
   }

   public void area() {
       System.out.println("Area of Rectangle is: " +  (width * height) ) ;
   }

   public void perimeter() {
       System.out.println("Perimeter of Rectangle is: " + ( (2* width) + 
       (2* height) ) ) ;
   }
}


class Square extends Rectangle{
          Square(double width, double height){
             super(width, height);
         }
       public void area() {
          System.out.println("Area of Square is: " + (super.getWidth() * super.getHeight()));
       }
       public void perimeter() {
            System.out.println("Perimeter of Square is: " + (4 * super.getWidth()));
          }
}
