
class Student{
    String name;
    int age;
    
    public void printInfo(){
        System.out.println("Name:\t"+ name);
        System.out.println("Age:\t"+ age);
    }
    
    Student(){
        
    }
    
    // parameteried constructor
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    // copy constructor
    Student(Student std2){
        this.name = std2.name;
        this.age = std2.age;
    }
}
class Constructor {
    public static void main(String[] args) {
        
        // Default constructor
        Student std = new Student();
        std.name = "Adrusta";
        std.age = 26;
        std.printInfo();
        
        // Parameterized constructor
        Student std1 = new Student("Vidya", 25);
        std1.printInfo();
        
        // Copy constructor
        Student std2 = new Student(std1);
        std2.printInfo();
    }
}
