package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class OpenGoogle extends Common {
    WebDriver driver = new FirefoxDriver();

    public OpenGoogle() {
    }

    public OpenGoogle(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//li[@role='presentation']/following-sibling::div//input)[1]")
    protected WebElement Search;

    @Test
    public void openGoogle() throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.navigate().to("https://www.google.com/");
        WebElement element = driver.findElement(By.xpath("//input[@title='Search']"));
        element.sendKeys("live");
        List<WebElement> elements = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            if (elements.get(i).getText().contains("live score")) {
                System.out.println(elements.get(i).getText() + "" + i);
                break;
            }
        }
//        clickOn(driver, Search);
//        wait(2000);
        driver.close();
    }
}
