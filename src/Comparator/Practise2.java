package Comparator;

import java.util.ArrayList;
import java.util.List;

class Students {
    private String name;
    private double gpa;

    public Students(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    public double getGpa() {
        return gpa;
    }
}
public class Practise2 {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students ("Aditya",6.3));
        students.add(new Students("Alex",6.4));
        students.add( new Students ("Dev",6.6));
        students.add( new Students ("Aishav",6.6));

        //Sort on basis of GPA and Name
        students.sort((a,b) -> {
            if(b.getGpa() - a.getGpa() > 0)
                return 1;
            else if(b.getGpa() - a.getGpa() < 0)
                return -1;
            else
                return a.getName().compareTo(b.getName());
        });

        for(Students s : students)
        {
            System.out.println(s.getName()+" "+s.getGpa());
        }
    }
}
