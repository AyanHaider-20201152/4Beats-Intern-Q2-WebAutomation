package fbeats_q2.pageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class archivePageElements {
    private static WebElement categoryButton_elm= null;
    private static WebElement categoryBox_elm= null;
    private static WebElement categoryDefault_elm = null;
    private static WebElement currentPaper_elm = null;

    public static WebElement categoryButton(WebDriver driver){
        categoryButton_elm = driver.findElement(By.tagName("h2"));
        return categoryButton_elm;
    }

    public static WebElement categoryBox(WebDriver driver){
        categoryBox_elm = driver.findElement(By.cssSelector("div[class='content']"));
        return categoryBox_elm;
    }

    public static WebElement categoryDefault(WebDriver driver){
        categoryDefault_elm = driver.findElement(By.cssSelector("a[class='thumbnail']"));
        return categoryDefault_elm;
    }

    public static WebElement currentPaper(WebDriver driver){
        currentPaper_elm = driver.findElement(By.cssSelector("a[class*='epost-image']"));
        return currentPaper_elm;
    }
}

