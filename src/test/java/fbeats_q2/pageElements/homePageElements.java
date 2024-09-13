package fbeats_q2.pageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class homePageElements {
    private static WebElement currentDate_elm = null;

    private static WebElement home_elm = null;

    private static WebElement currentPaper_elm = null;

    private static WebElement edition_elm = null;

    private static WebElement page_elm = null;
    private static WebElement specificPage_elm = null;

    private static WebElement date_elm = null;
    private static WebElement[] dateValues_elms = {null, null, null};
    private static WebElement dateMonthSlider_elm = null;

    private static WebElement[] article_elms;
    private static int numArticles = 0;
    private static WebElement articleBox_elm = null;
    private static WebElement articleBoxDrag_elm = null;
    private static WebElement[] articleBoxMagnify_elms = {null, null, null};

    private static WebElement share_elm = null;
    private static WebElement[] shareOption_elms;
    private static int numShareOptions = 0;

    
    public static WebElement currentDate_box(WebDriver driver){
        currentDate_elm = driver.findElement(By.cssSelector("input[id='datetext_cal']"));
        return currentDate_elm;
    }

    public static WebElement currentPaper_button(WebDriver driver){
        currentPaper_elm = driver.findElement(By.cssSelector("div[class*='site-logo']"));
        return currentPaper_elm;
    }

    public static WebElement home_button(WebDriver driver){
        home_elm = driver.findElement(By.cssSelector("div[class='col-sm-3 text-left']"));
        return home_elm;
    }

    public static WebElement edition_box(WebDriver driver){
        edition_elm =  driver.findElement(By.name("ddlistEdition"));
        return edition_elm;
    }

    public static WebElement page_box1(WebDriver driver){
        page_elm =  driver.findElement(By.name("ddlistPage"));
        return page_elm;
    }

    public static WebElement page_box2(WebDriver driver){
        page_elm =  driver.findElement(By.cssSelector("a[id='linkbtnThumb']"));
        return page_elm;
    }

    public static WebElement page_slider(WebDriver driver){
        page_elm =  driver.findElement(By.cssSelector("i[class='fa fa-chevron-right']"));
        return page_elm;
    }

    public static WebElement page_select(WebDriver driver, String page_num){
        String page_name = String.format("a[data-page='%s']", page_num);
        specificPage_elm = driver.findElement(By.cssSelector(page_name));
        return specificPage_elm;
    }

    public static WebElement dateBox_button(WebDriver driver){
        date_elm =  driver.findElement(By.cssSelector("button[id='datebtn_cal']"));
        return date_elm;
    }

    public static WebElement dateBox(WebDriver driver){
        date_elm =  driver.findElement(By.cssSelector("div[id='ui-datepicker-div']"));
        return date_elm;
    }

    public static WebElement dateBoxDay(WebDriver driver){
        date_elm =  driver.findElement(By.cssSelector("td[class*='ui-datepicker-current-day']"));
        return date_elm;
    }

    public static WebElement[] date_elms(WebDriver driver){
        dateValues_elms[0] = driver.findElement(By.cssSelector("td[data-handler='selectDay']"));
        dateValues_elms[1] = driver.findElement(By.cssSelector("select[class='ui-datepicker-month']"));
        dateValues_elms[2] = driver.findElement(By.cssSelector("select[class='ui-datepicker-year']"));
        return dateValues_elms;
    }

    public static WebElement dateMonthSlider(WebDriver driver){
        dateMonthSlider_elm = driver.findElement(By.cssSelector("a[data-handler='prev']"));
        return dateMonthSlider_elm;
    }

    public static WebElement[] article_elms(WebDriver driver){
        numArticles = driver.findElements(By.cssSelector("area[class='area']")).size();
        article_elms = new WebElement[numArticles];
        article_elms = driver.findElements(By.cssSelector("area[class='area']")).toArray(article_elms);
        return article_elms;
    }

    public static WebElement articleBox(WebDriver driver){
        articleBox_elm = driver.findElement(By.cssSelector("div[aria-describedby='dialogWindow']"));
        return articleBox_elm;
    }

    public static WebElement articleBoxDragBar(WebDriver driver){
        articleBoxDrag_elm = driver.findElement(By.cssSelector("span[id='ui-id-3']"));
        return articleBoxDrag_elm;
    }

    public static WebElement[] articleBoxMagnifyControls(WebDriver driver){
        articleBoxMagnify_elms = driver.findElements(By.cssSelector("li[class='hidden-xs']")).toArray(articleBoxMagnify_elms);
        return articleBoxMagnify_elms;
    }

    public static WebElement share_button(WebDriver driver){
        share_elm =  driver.findElement(By.cssSelector("i[class='fa fa-share']"));
        return share_elm;
    }

    public static WebElement[] share_options(WebDriver driver){
        numShareOptions = driver.findElements(By.cssSelector("a[target='_blank']")).size();
        shareOption_elms = new WebElement[numShareOptions];
        shareOption_elms = driver.findElements(By.cssSelector("a[target='_blank']")).toArray(shareOption_elms);
        return shareOption_elms;
    }

}


