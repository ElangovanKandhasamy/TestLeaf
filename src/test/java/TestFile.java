import LoginPage.OpenAmazon;
import LoginPage.OpenGoogle;
import org.testng.annotations.Test;
@Test
public class TestFile {

    static OpenAmazon openAmazon;
    static OpenGoogle openGoogle;
    public TestFile(){
        openGoogle = new OpenGoogle();
        openAmazon = new OpenAmazon();
    }
    @Test()
    public static void setOpenzAmazon(){
        openAmazon.openAmazon();
    }

    @Test()
    public static void setOpenGoogle() throws InterruptedException {
        openGoogle.openGoogle();
    }
}
