// Create an object of the given Person class with parameterized constructor initialising the name variable to ‘Ankit’, 
// and then to print the value of ‘name’ variable using getter method.

class Getter {
   public static void main(String[] args) {
   
       // Write code here
        Person person = new Person("Ankit");
        System.out.println(person.getName());
   }
}

class Person {
   private String name;
   public Person(String name) {       
       this.name = name;
   }
    
    public String getName(){
        return this.name;
    }
   // Declare a getter method here
}
