package excelread;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class ExcelCall {
    @Test
    public void dataGet() {
        try {
            Map<String, String> finalMapData = ReadExcelData.readExcelData();
            int size = finalMapData.size();
            System.out.println(size);
            for (Map.Entry<String, String> map : finalMapData.entrySet()) {
                System.out.println("Key" + " " + map.getKey() + " " + map.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
