package fbeats_q2.test_cases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import fbeats_q2.pageElements.archivePageElements;
import fbeats_q2.pageActions.archivePageActions;



public class archivePage_Tests {
    public static WebDriver driver= null; 
    public static WebElement element = null; 
    public static archivePageActions actor = null; 

    public static void main(String[] args) {
        Test_20();
    }

    @BeforeTest
    public static void setUP(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        actor = new archivePageActions(driver);

        driver.get("https://epaper.ittefaq.com.bd/archive/1970-01-01");
    }

    @Test(priority = 20)
    public static void Test_20() {
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 20 running");
            Thread.sleep(3000); 

            element = archivePageElements.categoryButton(driver);
            Thread.sleep(3000); 
            actor.click_categoryButton(element);
            Thread.sleep(3000); 
            element = archivePageElements.categoryBox(driver);
            Thread.sleep(3000); 
            assertTrue(actor.check_categoryBox(element));
            Thread.sleep(3000); 
            element = archivePageElements.categoryDefault(driver);
            Thread.sleep(3000); 
            actor.click_categoryDefault(element);
            Thread.sleep(3000); 
            assertTrue(archivePageElements.currentPaper(driver)!= null);

            Thread.sleep(2000); 
            System.out.println("Test 20 success\n");


        } catch (Exception e) {
            System.out.println("Test 20 failed\n ");
        }
    }

    @Test(priority = 21)
    public static void Test_21() {
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 21 running");
            Thread.sleep(3000); 

            element = archivePageElements.currentPaper(driver);
            Thread.sleep(3000); 
            actor.click_currentPaper(element);
            
            Thread.sleep(2000);
            System.out.println("Test 21 success\n");

        } catch (Exception e) {
            System.out.println("Test 21 failed\n");

        }
    }


    @AfterTest
    public static void closeDown(){
        driver.quit();
    }
}

