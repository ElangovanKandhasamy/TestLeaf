package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class reader {
    public void fileRedader() throws IOException {

        BufferedReader reader = Files.newBufferedReader(Paths.get("./src/test/testData/ExcelData2.xlsx"));
        String inValue;
        //while(inValue=reader.readLine() != null){
        //System.out.println(inValue);

    }

    public static void readThemAll() throws IOException {
        List<String> readAll = Files.readAllLines(Paths.get("./src/test/testData/ExcelData2.xlsx"));
        for (String s : readAll) {
            System.out.println(s);
        }

    }
//}

    public static void main(String[] args) throws IOException {
        readThemAll();

    }
}
