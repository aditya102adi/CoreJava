package InnerClass;

//abstract class My {
//    abstract void display();
//}
////Local Inner Anonymous Class
//class Outer2 {
//    public void method () {
//        My obj = new My()
//        {
//            public void display()
//            {
//                System.out.println("Hello");
//            }
//        };
//
//        obj.display();
//    }
//}

class Outer2 {
    static int x = 10;
    int y = 10;
    static class Inner {
        public void show()
        {
            System.out.println("Static Inner Method");
        }
    }
    public void display()
    {
        Inner obj = new Inner();
        obj.show();
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        Outer2 obj = new Outer2();
        obj.display();

        Outer2.Inner obj2 = new Outer2.Inner();
        obj2.show();
    }
}
