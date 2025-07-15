package Interfaces;
interface Member {
    void callBack();
}

class Shop {
    Member[] mem = new Member[100];
    int count = 0;
    void register(Member m) {
        mem[count++] = m;
    }
    void inviteSal() {
        for(int i=0;i<count;i++)
            mem[i].callBack();
    }

}
public class Shopping {
}
