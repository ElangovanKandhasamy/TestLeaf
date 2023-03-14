import LoginPage.OpenAmazon;
import LoginPage.OpenGoogle;
import org.testng.annotations.Test;

@Test
public class TestFile2 {

    OpenAmazon openAmazon;
    static OpenGoogle openGoogle;
    public TestFile2(){
        openGoogle = new OpenGoogle();
        openAmazon = new OpenAmazon();
    }

    @Test()
    public static void setOpenGoogle() throws InterruptedException {
        openGoogle.openGoogle();
    }
    @Test()
    public void setOpenzAmazon(){
        openAmazon.openAmazon();
    }
}
