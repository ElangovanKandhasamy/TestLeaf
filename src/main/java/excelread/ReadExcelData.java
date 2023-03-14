package excelread;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class ReadExcelData {
    public static Map<String, String> readExcelData() {
        Map<String, String> excelData = new HashMap<>();
        try {
            FileInputStream inputStream = new FileInputStream("./src/test/testData/ExcelData2.xlsx");
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0);
            int row = sheet.getLastRowNum();
            System.out.println(row);
            for (int i = 0; i <= row; i++) {
                Row row1 = sheet.getRow(i);
                Cell cell = row1.getCell(0);
                String key = cell.getStringCellValue().trim();
                Cell cell1 = row1.getCell(1);
                String value = cell1.getStringCellValue().trim();
                excelData.put(key,value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return excelData;
    }

}
