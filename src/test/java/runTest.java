import org.testng.annotations.Test;

@Test
public class runTest extends TestFile {
    public static void runCases() throws InterruptedException {
        TestFile.setOpenzAmazon();
        TestFile.setOpenGoogle();
    }

}
