package InnerClass;

abstract class My {
    abstract void display();
}

class Outer2 {
    public void method () {
        My obj = new My()
        {
            public void display()
            {
                System.out.println("Hello");
            }
        };

        obj.display();
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        Outer2 obj = new Outer2();
        obj.method();
    }
}
