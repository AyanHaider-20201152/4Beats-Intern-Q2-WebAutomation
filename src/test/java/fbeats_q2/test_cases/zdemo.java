package fbeats_q2.test_cases;

// import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
// import org.openqa.selenium.support.pagefactory.ByChained;

import fbeats_q2.pageElements.homePageElements;
// import fbeats_q2.pageElements.archivePageElements;


public class zdemo {
    public static void main(String[] args) {
        Search();
    }

    public static void Search() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://epaper.ittefaq.com.bd/");
        // driver.get("https://epaper.ittefaq.com.bd/archive/1970-01-01");
        
        try {
            Thread.sleep(2000); 
            
            homePageElements.article_elms(driver)[5].click();
            Thread.sleep(6000);
            driver.findElement(By.cssSelector("div[aria-describedby='dialogWindow']")).findElement((By.cssSelector("img[class='main_image']")));
            
            System.out.println("FUCK");
            // homePageElements.articleBoxMagnifyControls(driver)[2].click();
            Actions builder = new Actions(driver);
            builder.moveToLocation(825,200).click().perform();
            Thread.sleep(6000);
            driver.findElement(By.cssSelector("img[class='main_image']"));
            System.out.println("ME");
            Thread.sleep(4000); 
        } catch (Exception e) {
            // TODO: handle exception 
        }
        
        // driver.quit();
    }
}
