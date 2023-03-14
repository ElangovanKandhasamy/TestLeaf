package File;

import java.util.ArrayList;

public class Lamda {
    public static void lamdaFun(){
        ArrayList<String > list = new ArrayList<String>();
        list.add("Elango");
        list.add("Nandini");
        list.add("ElaNandy");
        list.forEach(R-> System.out.print(R.toString()));
        System.out.println("<<<<<<<<<");
        list.removeIf(E->E.contains("ndy"));
        list.forEach(R-> System.out.println(R.toString()));
    }

    public static void main(String[] args) {
        lamdaFun();
    }
}
