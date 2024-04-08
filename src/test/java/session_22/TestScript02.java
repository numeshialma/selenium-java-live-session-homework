package session_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Open application “https//www.demoblaze.com/index.html”
 * 1.	Total number of links
 * 2.	Total number of images
 * 3.	Click on Any product link using linkText/partialLinkText
 */
public class TestScript02 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Open application “https//www.demoblaze.com/index.html”
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().window().maximize();

        // 1) Total number of links
        List<WebElement> links = driver.findElements(By.tagName("p"));
        System.out.println("Total number of links : " +links.size());

        // 2) Total number of images
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total number of images : " +images.size());

        // Click on Any product link using linkText
        WebElement samsungLink1 = driver.findElement(By.linkText("Samsung galaxy s6"));
        samsungLink1.click();
        System.out.println("Link Text.. ");

        // Click on Any product link using partialLinkText
        WebElement samsungLink2 = driver.findElement(By.linkText("Samsung"));
        samsungLink2.click();
        System.out.println("Partial Link Text.. ");
    }




}
