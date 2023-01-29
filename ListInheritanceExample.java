import java.util.List;
import java.util.ArrayList;

class Main
{
    public static void main(String[] args) {
       List<Student> studentList = new ArrayList<Student>();
    
       studentList.add(new Student("Sujit", 1));
       studentList.add(new Student("Siddharth", 2));
       studentList.add(new Student("Karanpreet", 3));
       studentList.add(new Student("Hari", 5));
    
       printStudentList(studentList);
    }
    
       static void printStudentList(List<Student> students) {
           for(Student s : students) {
               System.out.println(s.getDetails());
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
    
    public String getDetails(){
        return this.name+" "+this.roll_no;
    }
}
