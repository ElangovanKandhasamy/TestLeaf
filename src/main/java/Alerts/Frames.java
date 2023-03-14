package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Frames {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://leafground.com/");
        driver.manage().window().maximize();
        WebDriverWait expllicitlyWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        expllicitlyWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("topbarProfileForm"))));
        driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]")).click();
        driver.findElement(By.xpath("(//ul[@role='menu'])[2]//span[text()='Frame']")).click();
        WebElement element = driver.findElement(By.xpath("(//div[@class='card']//iframe)[1]"));
        driver.switchTo().frame(element);
        driver.findElement(By.id("Click")).click();
        driver.switchTo().defaultContent();
        WebElement element1 = driver.findElement(By.xpath("(//div[@class='card']//iframe)[3]"));
        driver.switchTo().frame(element1);
        WebElement frame2 = driver.findElement(By.id("frame2"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.id("Click")).click();
        driver.switchTo().defaultContent();
        WebElement element2 = driver.findElement(By.xpath("(//div[@class='card']//iframe)[2]"));
        driver.switchTo().frame(element2);
        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        System.out.println(frames.size());

    }
}
