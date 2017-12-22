package ooplab5;

import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {
//ArrayList
        ArrayList list = new ArrayList();
        String name = "BOW";
        list.add(name);
        System.out.println(list);
        list.add("BEEM");
        list.add("JANE");
        System.out.println(list);
        list.add(2, "FEEM");
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add(10.10);
        System.out.println(list);
        list.remove("BEEM");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.indexOf("JANE"));

    }//main
}//class
