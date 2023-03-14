import org.testng.annotations.Test;

@Test
public class runTest2 extends TestFile {
    public static void runCases() throws InterruptedException {
        TestFile.setOpenzAmazon();
        TestFile.setOpenGoogle();
    }

}
