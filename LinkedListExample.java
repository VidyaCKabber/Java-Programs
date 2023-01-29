import java.util.LinkedList;

class LinkedListExample {
    public static void main(String[] args) {
        Student s1 = new Student("Ram 1", 1);
        Student s2 = new Student("Ram 2", 2);
        Student s3 = new Student("Ram 3", 3);
        Student s4 = new Student("Ram 4", 4);
        Student s5 = new Student("Ram 5", 5);
        
        LinkedList<Student> ll = new LinkedList<Student>();
        ll.add(s1);
        ll.add(s2);
        ll.add(s3);
        ll.add(s4);
        ll.add(s5);
        
        PrintDetails(ll);
    }
    
    public static void PrintDetails(LinkedList<Student> linkedList){
        
        for(Student std : linkedList){
            std.StudentInfo();
        }
        
    }
}

class Student{
    String name;
    int Roll_No;
    
    Student(String name, int Roll_No){
        this.name = name;
        this.Roll_No = Roll_No;
    }
    
    public void StudentInfo(){
        System.out.println("\n Name:\t"+ this.name + "\t Roll No:\t"+this.Roll_No);
    }
}
