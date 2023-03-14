package File;

import java.util.ArrayList;


public class LinkedList {

    public static void listIte() {
        ArrayList<String> list = new ArrayList<>();
        java.util.LinkedList<String> list2= new java.util.LinkedList<>();
        list.add("Elango");
        list.add("Nandhini");
        list2.add("Yes");
        list2.add("Correct");
        System.out.println(list);
        System.out.println(list2);
        list.addAll(list2);
        System.out.println(list);
    }

    public static void main(String[] args) {
        listIte();
    }
}
