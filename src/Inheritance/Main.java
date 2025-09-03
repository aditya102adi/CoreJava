package Inheritance;
class School {
    private String name;
    School()
    {
        this.name = "DPS";
    }
    void printSchoolName() {
        System.out.println("School Name is: "+name);
    }
}

//Middle class or intemediatery class 
class Student extends School {
    private String name;
    Student(String name){
        this.name = name;
    }
    void printStudentName()
    {
        System.out.println("Student Name is: "+name);
    }
}

class Parent extends Student {
    private String name;
    Parent(String name, String studentName)
    {
        super(studentName);
        this.name = name;
    }

    void printParentName()
    {
        System.out.println("Parent Name: "+name);
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p1 = new Parent("Dad","Adi");
        p1.printParentName();
        p1.printSchoolName();
        p1.printStudentName();
    }
}
