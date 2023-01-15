/*
    Create a class named 'Member' having the following members:
    Data members
    1 - Name
    2 - Age
    3 - Phone number
    4 - Address
    5 - Salary

    It also has a method named 'printSalary' which prints the salary of the members.
    Two classes 'Employee' and 'Manager' inherits the 'Member' class.
    The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
    Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.

*/

public class Organization {
    public static void main(String[] args){
        System.out.println("Employee details:\n");
        Employee emp = new Employee("Vidya", 25, 892323231, "#123, 2nd main, Marathalli, Bangalore", 7, "Backend Automation Engineer");
        emp.getMemberDetails();
        emp.printSalary();
        emp.empSpecialiation();

        System.out.println("\n\nManager details:\n");
        Manager mgr = new Manager("Parag", 48, 892189287, "# 234, 3rd main, Bhavdhan, Pune", 30, "Engineering Specialization" );
        mgr.getMemberDetails();
        mgr.printSalary();
        mgr.getManagerDeparment();
    }
}


public class Member {
    public String Name;
    public int Age;
    long phoneNumber;
    public String Address;
    private double Salary;

    Member(String name, int age, long phoneNumber, String address, double salary){
        this.Name = name;
        this.Age = age;
        this.phoneNumber = phoneNumber;
        this.Address = address;
        this.Salary = salary;
    }

    public void getMemberDetails(){
        System.out.println("Name : "+ this.Name);
        System.out.println("Age : "+ this.Age);
        System.out.println("Phone number : "+ (int)this.phoneNumber);
        System.out.println("Address : "+ this.Address);
    }

    public void printSalary(){
        System.out.println("Salary : "+ this.Salary+ " L/annum");
    }
}

public class Manager extends Member{
    String Department;
    Manager(String name, int age, long phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.Department = department;

    }
        public void getManagerDeparment(){
            System.out.println("Department : "+ this.Department);
        }
}

public class Employee extends Member {
    String specialization;

    Employee(String name, int age, long phoneNumber, String address, double salary, String specialization ){
        super(name, age, phoneNumber, address,salary);
        this.specialization = specialization;
    }

    public void empSpecialiation(){
        System.out.println("Specialization : "+ this.specialization);
    }

}
