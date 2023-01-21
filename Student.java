// Declare a constructor in the Student class and then create a new object named s1 (name -  karan | roll number - 1056 | cgpa - 8.8) and call method displayProfile( ) below. Also, print details of percentage of s1 using findPercentage( ) method.
// The findPercentage() method should be used in printing as 'Percentage of s1 is 88.0'. Check sample output below.


class Student {
    public static void main(String[] args) {

    // Create an object named 's1' and complete the code to print the desired output
    Student s1 = new Student("karan", 1056, 8.8);
    s1.displayProfile();
    double dle = s1.findPercentage();
    
    System.out.println("Percentage of s1 is "+ dle);
    }
}

class Student {
    public int rollno;
    public String name;
    public double cgpa;

    // Declare constructor of 'Student' class here
    Student(String name, int rollno, double cgpa){
        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public void displayProfile() {
        System.out.println(this.rollno + " " + this.name + " " + this.cgpa);
    }
    public double findPercentage() {
        double percent = this.cgpa * 10;
        return percent;
    }
}
