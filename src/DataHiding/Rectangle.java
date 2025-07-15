package DataHiding;

class Dimension {
    private int length;
    private int breadth;

    //Getter and setter
    public int getLength() {
        return length;
    }
    public void setLength(int len) {
        this.length = len;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int area() {
        return length*breadth;
    }
}
public class Rectangle {
    public static void main(String[] args) {
        Dimension obj = new Dimension();
        obj.setLength(12);
        obj.setBreadth(10);

        System.out.println("The length is "+obj.getLength());
        System.out.println("The breadth is "+obj.getBreadth());
        System.out.println("The area is "+obj.area());
    }
}
