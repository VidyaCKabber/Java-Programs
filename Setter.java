// Create an object of the given Person class and initialise that object by assigning 'Ankit' to the 'name' variable using the setter method.

class Setter {
   public static void main(String[] args) {
   
       // Write code here
       Person person = new Person();
       person.setName("Ankit");
   }
}

class Person {
   private String name;
   public String getName() {
       return name;
   }
   
   // Declare a setter method here
   public void setName(String name){
       this.name = name;
   }
}
