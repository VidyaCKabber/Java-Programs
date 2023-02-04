class CompositionExample {
    public static void main(String[] args) {
        Car c = new Car("a", "b", 10);
        Adult a = new Adult("vidya", 2);
        
        a.setMyCar(c);
        a.getMyCar();
    }
}

class Person {
  private String eyeColor;
  protected String name;
  Car myCar;
  
  public Person(String name) {
    this.name = name;
  }

  public void setMyCar(Car car){
    this.myCar = car; 
  }
  
  public void getMyCar(){
    System.out.println("Brand : "+this.myCar.brand);
    System.out.println("\nModel : "+this.myCar.model);
    System.out.println("\nYear : "+this.myCar.year);
  }
}

class Adult extends Person {
  protected int age;

  public Adult(String name, int age) {
    super(name);
    this.age = age;
  }
}

class Car {
  String brand;
  String model;
  int year;

  public Car(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }
} 
