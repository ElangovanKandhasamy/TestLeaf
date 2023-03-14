package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LearnAlerts {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://leafground.com/");
        driver.manage().window().maximize();
        WebDriverWait expllicitlyWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebDriverWait expllicitlyWait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        expllicitlyWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("topbarProfileForm"))));
        driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]")).click();
        expllicitlyWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Alert']"))));
        driver.findElement(By.xpath("//span[text()='Alert']")).click();
//        driver.findElement(By.xpath("//h5[contains(text(),'Alert')]/following-sibling::button")).click();
//        Thread.sleep(20);
//        driver.findElement(By.xpath("//h5[contains(text(),'Alert (Confirm Dialog)')]/following-sibling::button")).click();

//        alert.accept();
        Thread.sleep(20);
        driver.findElement(By.xpath("//h5[contains(text(),'Alert (Prompt Dialog)')]/following-sibling::button")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("TestLeaf");
    }
}
