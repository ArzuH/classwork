

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 100));
        }
        ArrayList<Integer> odd;
        odd = new ArrayList<Integer>();

        ArrayList<Integer> even;
        even = new ArrayList<Integer>();
        list.forEach(item -> { if (item%2!=0) odd.add(item); even.add(item);});


        System.out.println(list);
        System.out.println(odd);
        System.out.println(even);
    }

}
