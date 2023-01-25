
class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Neelima", "EPGP");
        ResearchStudent r1 = new ResearchStudent("Vidya", "MS", "Engineering Maths");
        
        Professor p1 = new Professor("Page", "Maths");
        
        Person[] array = {s1, r1, p1};
        Test(array);
    }
    
    public static void Test(Person[] array){
        for(Person person : array){
            person.getDetails();
        }
    }
}

abstract class Person {
    protected String name;
    Person(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    abstract public void getDetails();
}

class Student extends Person{
    protected String class_name;
    Student( String name, String class_name){
        super(name);
        this.class_name = class_name;
    }
    
    public void getDetails(){
        System.out.println("\nName : " + super.getName() + "\n Class : " + this.class_name);
    }
}

class ResearchStudent extends Student{
    protected String research_area;
    ResearchStudent( String name, String class_name, String research_area){
        super(name, class_name);
        this.research_area = research_area;
    }
    
    public void getDetails(){
        System.out.println("\nName : " + super.getName() + "\n Class : " + this.research_area);
    }
}


class Professor extends Person{
    protected String subject;
    Professor( String name, String subject){
        super(name);
        this.subject = subject;
    }
    
    public void getDetails(){
        System.out.println("\n Name : " + super.getName() + "\n Reasearch area : " + this.subject);
    }
}
