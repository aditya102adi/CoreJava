package Interfaces;
interface Member {
    void callBack();
    int x = 10;
    int X = 10;
}

class Store {
    Member[] mem = new Member[10];
    int count = 0;
    void register(Member m) {
        mem[count++] = m;
    }
    void inviteSal() {
        for(int i=0;i<count;i++)
            mem[i].callBack();
    }
}

class Customer implements Member {
    String name;
    Customer(String name) {
        this.name = name;
    }

    public void callBack(){
        System.out.println(name+" will visit the store");
    }
}
public class Shopping {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Smith");
        Customer c3 = new Customer("Rex");

        s.register(c1);
        s.register(c2);
        s.register(c3);

        s.inviteSal();
    }
}
