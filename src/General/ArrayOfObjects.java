package General;

class Subject {
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    Subject (String subID,String name,int maxMarks) {
        this.subID = subID;
        this.name = name;
        setMaxMarks(maxMarks);
    }
    public String getSubID() { return subID; }
    public String getName() { return name; }
    public int getMaxMarks() { return maxMarks; }
    public int getMarksObtain() { return marksObtain; }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public void setMarksObtain(int marksObtain) {
        this.marksObtain = marksObtain;
    }

    boolean isQualified() {
        return marksObtain >= maxMarks/10*4;
    }

    public String toString() {
        return "\nSubject ID: "+subID+"\nName: "+name+"\nMarks Obtained: "+marksObtain;
    }

}

class Student {
    private String rollNo;
    private String name;
    private String dept;
    private int numOfSub;
    private Subject sub[];

    public Student(String rollNo,String name)
    {
        this.rollNo=rollNo;
        this.name=name;

    }
    public Student(String rollNo,String name,int ns)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.numOfSub=ns;
    }

    public String getRollNo(){return rollNo;}
    public String getName(){return name;}
    public String getDept(){return dept;}
    public int getNoOfSubjects(){return numOfSub;}
    public Subject[] getSubjects(){return sub;}

    public void setDept(String dept)
    {
        this.dept=dept;
    }
    public void setSubjects(Subject ...subs)
    {
        for(int i=0;i<subs.length;i++)
            sub[i]=subs[i];
    }

    public String toString()
    {
        return "Roll :" +rollNo+"\nName :"+name+"\nDept :"+dept;
    }
}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Subject subs[] = new Subject[3];
        subs[0] = new Subject("s01","DS",100);
        subs[1] = new Subject("s02","Algo",100);
        subs[2] = new Subject("s03","Operating System",100);

        for(Subject s:subs)
            System.out.println(s);

        Student s1 = new Student("10","Aditya",3);
        System.out.println(s1);
    }
}
