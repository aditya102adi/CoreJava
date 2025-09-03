package Comparator;

import java.util.*;

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1,Integer o2) {
        return o2 - o1;
    }
}

class StringComp implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
public class Practise {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(4, 6, 8, 7, 6, 3, 1, 6, 11));

        list.sort(new MyComparator());
        System.out.println(list);

        List<String> l2 = new ArrayList<>(Arrays.asList("Aditya","Mona","Nanu","Andy","Dev"));
        //Desc order of names len
        l2.sort((a,b) -> b.length() - a.length());

        System.out.println(l2);

    }
}
