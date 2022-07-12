package by.it.penkrat.jd01_11;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<String> listNew = new ArrayList<>();
        listNew.add("dog");
        listNew.add("cat");
        listNew.add("lyon");

        List<String> list = new ArrayList<>();


        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.printf("first=%s last=%s%n", list.get(0), list.get(list.size()-1));

        list = new ListA<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.printf("first=%s last=%s%n", list.get(0), list.get(list.size()-1));

        list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.printf("first=%s last=%s%n", list.get(0), list.get(list.size()-1));
        list.set(0, "ten");
        System.out.println("method set" + list);
        list.add(3, "new element");
        System.out.println(list);
        list.addAll(listNew);
        System.out.println(list);

        list = new ListB<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.printf("first=%s last=%s%n", list.get(0), list.get(list.size()-1));
        list.set(0, "ten");
        System.out.println("method set: " + list);
        list.add(3, "new element");
        System.out.println("method add by index: " + list);
        list.addAll(listNew);
        System.out.println("method addAll: " + list);

    }
}
