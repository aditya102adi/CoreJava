package Interfaces;

interface Test {
    final int X = 10;
    void meth1();
    void meth2();
    default void meth3()
    {
        System.out.println("Method 3");
    }
}

interface Test2 extends Test {
    void meth4();
}

class My implements Test2 {
    public void meth1(){}
    public void meth2(){}
    public void meth4() {}

    public void meth3() {
        System.out.println("Overriding");
    }
}
public class InterfacePractise {
    public static void main(String[] args) {
        My obj = new My();
        obj.meth3();
    }

}
