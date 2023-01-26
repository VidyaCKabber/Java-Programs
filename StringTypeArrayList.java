import java.util.*;

class StringTypeArrayList {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Sujit", 1));
        studentList.add(new Student("Siddharth", 2));
        studentList.add(new Student("Karanpreet", 3));
        studentList.add(3, new Student("Tricha", 5));
        studentList.add(4,new Student("Hari", 4));
        
        Print(studentList);
    }
    
    public void Print(ArrayList<Student> students){
        for(Student s: students){
            s.getDetails();
        }
    }
}

class Student{
    String name;
    int roll_no;
    
    Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
    
    public void getDetails(){
        System.out.println("\nName : "+this.name+"\t Roll No : "+this.roll_no);
    }
}
