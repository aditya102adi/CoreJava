package InnerClass;

class Outer {
    int x = 10;
    class Inner {
        int y = 20;
        public void display() {
            System.out.println(x+" "+y);
        }
    }

    public void outerDisplay() {
        Inner i = new Inner();
        i.display();
        System.out.println(i.y);
    }
}
public class NestedInner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerDisplay();

        Outer.Inner obj = new Outer().new Inner();
        obj.display();
        System.out.println(obj.y);
    }
}
