package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DragAndDrop {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://leafground.com/");
        driver.manage().window().maximize();
        WebDriverWait expllicitlyWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebDriverWait expllicitlyWait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        expllicitlyWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("topbarProfileForm"))));
        driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]")).click();
        driver.findElement(By.xpath("(//ul[@role='menu'])[2]//span[text()='Drag']")).click();
        WebElement element = driver.findElement(By.xpath("//span[text()='Drag and Drop']//.."));
        Point point=element.getLocation();
        int x = point.getX();
        int y = point.getY();
        WebElement target = driver.findElement(By.xpath("(//div[@class='ui-panel-content ui-widget-content'])[2]"));
        WebElement source = driver.findElement(By.xpath("(//div[@class='ui-panel-content ui-widget-content'])[3]"));
        Actions action= new Actions(driver);
       // action.dragAndDrop(source,target).perform();
        action.dragAndDropBy(element,x+200,y+100).perform();
       Thread.sleep(20000);
        driver.close();
}}
