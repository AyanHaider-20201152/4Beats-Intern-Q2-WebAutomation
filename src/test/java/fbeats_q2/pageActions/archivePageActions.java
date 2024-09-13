package fbeats_q2.pageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class archivePageActions {
    WebDriver driver = null;

    private boolean categoryBox_status = false;

    public archivePageActions(WebDriver driver){
        this.driver = driver; 
    }



    public void click_categoryButton(WebElement categoryButton_elm){
        categoryButton_elm.click();
    }

    public void click_categoryDefault(WebElement categoryDefault_elm){
        categoryDefault_elm.click();
    }

    public void click_currentPaper(WebElement currentPaper_elm){
        currentPaper_elm.click();
    }

    
    
    public boolean check_categoryBox(WebElement categoryBox_elm){
        categoryBox_status = categoryBox_elm.isDisplayed();
        return categoryBox_status;
    }

}


// public static WebElement[] date_values(WebDriver driver){
//     dateValues_elm[0] = driver.findElement(By.cssSelector("td[class*='ui-datepicker-current-day']"));
//     dateValues_elm[1] = driver.findElement(new ByChained(By.cssSelector("select[class='ui-datepicker-month']"), By.cssSelector("option[selected='selected']")));
//     dateValues_elm[2] = driver.findElement(new ByChained(By.cssSelector("select[class='ui-datepicker-year']"), By.cssSelector("option[selected='selected']")));

//     return dateValues_elm;
// }