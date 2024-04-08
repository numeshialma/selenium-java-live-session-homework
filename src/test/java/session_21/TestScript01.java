package session_21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 1) Launch browser (chrome)
 * 2) Open URL https://demo.nopcommerce.com/
 * 3) Validate title should be "nopCommerce demo store"
 * 4) Close page
 */
public class TestScript01 {

    public static void main(String[] args) {

        // 1) Launch browser (chrome)
        WebDriver driver = new ChromeDriver();

        // 2) Open URL https://demo.nopcommerce.com/
        driver.get("https://demo.nopcommerce.com/");

        // 3) Validate title should be "nopCommerce demo store"
        String actualTitle = driver.getTitle();

        if(actualTitle.equals("nopCommerce demo store")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        // 4) Close page
        driver.close();
    }
}
