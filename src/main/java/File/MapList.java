package File;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class MapList {
         public static void learnMap(){
             Map<String,String> dataMap= new HashMap<String,String>();
             dataMap.put("1","Elango");
             dataMap.put("2","Nandhini");
             dataMap.put("3","Love");
             dataMap.put("4","Elannnn");
             dataMap.put("5","");
             dataMap.put("6","");
             dataMap.put("","hello");
             dataMap.put("","add");
             dataMap.put("","add1");
             dataMap.putIfAbsent("","e");
             System.out.println(dataMap.get("hello"));
             dataMap.forEach((k,v)-> System.out.println(k+" | "+v));
             dataMap.replaceAll((k,v)-> String.valueOf(v.toCharArray()));
             dataMap.forEach((k,v)-> System.out.println(k+" | "+v));


         }

    public static void main(String[] args) {
             learnMap();

    }
}
