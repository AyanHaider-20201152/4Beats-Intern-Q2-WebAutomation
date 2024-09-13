package fbeats_q2.pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class homePageActions {
    WebDriver driver = null;

    private String editionValue = null;
    private String pageNumber = null;
    private String dateValue = null;
    private String article_size = null;
    private String articleBox_location = null;

    private boolean editionBox_status = false;
    private boolean pageBox_status = false;
    private boolean dateBox_status = false;
    private boolean articleBox_status = false;
    private boolean shareOption_status = false;

    

    public homePageActions(WebDriver driver){
        this.driver = driver; 
    }

    public String get_edition(WebElement edition_elm){
        editionValue = edition_elm.getText();
        return editionValue;
    }

    public String get_pageNumber(WebElement page_elm){
        pageNumber = page_elm.getText();
        return pageNumber;
    }

    public String get_paperDate(WebElement currentDate_elm){
        dateValue = currentDate_elm.getAttribute("value");
        return dateValue;
    }

    public String get_dateBoxDay(WebElement dateBoxDay_elm){
        dateValue = dateBoxDay_elm.getText();
        return dateValue;
    }

    public String get_dateBoxMonth(WebElement[] dateValues_elm){
        dateValue = dateValues_elm[1].findElement(By.cssSelector("option[selected='selected']")).getText();
        return dateValue;
    }

    public String get_dateBoxYear(WebElement[] dateValues_elm){
        dateValue = dateValues_elm[2].findElement(By.cssSelector("option[selected='selected']")).getText();
        return dateValue;
    }

    public String get_articleBoxLocation(WebElement articleBox_elm){
        articleBox_location = articleBox_elm.getAttribute("style");
        return articleBox_location;
    }

    public String get_articleSize(){
        article_size = driver.findElement(By.cssSelector("img[class='main_image']")).getAttribute("style");
        return article_size;
    }





    // img[class='main_image']

    public void click_homeButton(WebElement home_elm){
        home_elm.click();
    }

    public void click_currentPaperButton(WebElement currentPaper_elm){
        currentPaper_elm.click();
    }

    public void click_editionViaDropDown(WebElement edition_elm){
        Select objSelect = new Select(edition_elm);
        objSelect.selectByIndex(0);    
    }

    public void click_pageNumViaDropDown(WebElement page_elm){
        Select objSelect = new Select(page_elm);
        objSelect.selectByIndex(1); 
    }

    public void click_pageBox(WebElement page_elm){
        page_elm.click();
    }

    public void click_pageNumViaBox(WebElement specificPage_elm){
        specificPage_elm.click();
    }

    public void click_pageSlider(WebElement page_elm){
        page_elm.click();
    }

    public void click_dateBox(WebElement dateBox_elm){
        dateBox_elm.click();
    }

    public void click_dateBoxDay(WebElement dateBox_elm){
        dateBox_elm.click();
    }

    public void click_dateBoxMonthViaDropDown(WebElement dateBox_elm){
        Select objSelect = new Select(dateBox_elm);
        objSelect.selectByIndex(0); 
    }

    public void click_dateBoxMonthViaSlider(WebElement dateBox_elm){
        dateBox_elm.click();
    }

    public void click_dateBoxYear(WebElement dateBox_elm){
        Select objSelect = new Select(dateBox_elm);
        objSelect.selectByIndex(0); 
    }

    public void click_article(WebElement[] article_elms){
        article_elms[5].click();
    }

    public void click_articleZoom(){
        Actions builder = new Actions(driver);
        builder.moveToLocation(825,200).click().perform();
    }

    public void clickDrag_articleBox(WebElement articleBox_elm){
        Actions builder = new Actions(driver);

        builder.clickAndHold(articleBox_elm)
        .moveToElement(articleBox_elm, 35, 10)
        .perform();
    }

    public void click_shareButton(WebElement share_elm){
        share_elm.click();
    }

    public void click_shareOptions(WebElement[] shareOption_elms){
        shareOption_elms[0].click();
    }


    
    public boolean check_editionBox(WebElement page_elm){
        editionBox_status = page_elm.isDisplayed();
        return editionBox_status;
    }

    public boolean check_pageBox(WebElement page_elm){
        pageBox_status = page_elm.isDisplayed();
        return pageBox_status;
    }

    public boolean check_dateBox(WebElement date_elm){
        dateBox_status = date_elm.isDisplayed();
        return dateBox_status;
    }

    public boolean check_articleBox(WebElement articleBox_elm){
        articleBox_status = articleBox_elm.isDisplayed();
        return articleBox_status;
    }

    public boolean check_shareOptions(WebElement shareOption_elm){
        shareOption_status = shareOption_elm.isDisplayed();
        return shareOption_status;
    }




}
