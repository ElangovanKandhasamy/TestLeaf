package File;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

    public static void listIte() {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
      //  int size = scanner.nextInt();
//        for (int i = 0; i <= size; i++) {
//            list.add(scanner.nextLine());
//        }
        list.add("Elango");
        list.add("Nandhini");
    System.out.println(list.get(0));

        for (Object S : list) {
          System.out.print("" +S);
//        String Sq= S.toString();
//            System.out.println(Sq);
        }
        list.add(2,"Loves");
        System.out.print(list);
        list.set(1,"Nandhu");
        System.out.println(list);
        list2= (ArrayList<String>) list.clone();
        System.out.println(list2);
    }

    public static void main(String[] args) {
        listIte();
    }
}
