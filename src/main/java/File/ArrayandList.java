package File;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayandList {
    public static <arr> void arrayList() {
        List<String> list = new ArrayList<>();
        list.add("Salem");
        list.add("Madhurai");
        Object[] a =list.toArray();
        int length = a.length;
        System.out.println(length);
        for (Object s :a){
            if(s.toString().contains("em"))
            System.out.println(s);
        }
    }

    public static void passArrayToList(){
        String[] arr= {"Elango","Nandhini","Loves"};
        List<String> strings = Arrays.asList(arr);
        strings.forEach(E-> System.out.println(E.toString()));
    }

    public static void main(String[] args) {
        //arrayList();
        passArrayToList();
    }
}
