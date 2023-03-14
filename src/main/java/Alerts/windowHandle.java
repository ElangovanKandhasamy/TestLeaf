package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class windowHandle {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://leafground.com/");
        driver.manage().window().maximize();
        WebDriverWait expllicitlyWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        expllicitlyWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("topbarProfileForm"))));
        driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]")).click();
        driver.findElement(By.xpath("(//ul[@role='menu'])[2]//span[text()='Window']")).click();
        driver.findElement(By.xpath("(//button[@role='button'])[1]")).click();
        Set<String> windowSet=driver.getWindowHandles();
        List<String> windowCount=new ArrayList<>(windowSet);
        int size = windowCount.size();
        System.out.println(size);
        windowCount.get(0);
        driver.close();
        windowCount.get(1);
        driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]")).click();
        driver.findElement(By.xpath("(//ul[@role='menu'])[2]//span[text()='Window']")).click();
        driver.findElement(By.xpath("(//button[@role='button'])[2]")).click();
        driver.close();
    }}
