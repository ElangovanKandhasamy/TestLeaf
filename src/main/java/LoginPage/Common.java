package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Common {
    public static void clickOn(WebDriver driver,WebElement locator){
        try{
            WebElement clickOn= new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(locator));
            clickOn.click();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
