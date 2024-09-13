package fbeats_q2.test_cases;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fbeats_q2.pageElements.homePageElements;
import fbeats_q2.pageActions.homePageActions;



public class homePage_Tests {
    public static WebDriver driver= null; 
    public static WebElement element = null; 
    public static WebElement[] elements = null; 
    public static homePageActions actor = null; 
    public static String currentDate = null;

    public static void main(String[] args) {
        
    }

    @BeforeMethod
    public static void setUP(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        actor = new homePageActions(driver);

        driver.get("https://epaper.ittefaq.com.bd/");
        try {
            Thread.sleep(2000); 
            element = homePageElements.currentDate_box(driver);
            Thread.sleep(2000); 
            currentDate = actor.get_paperDate(element);
            Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println("Setup failed\n");
            assertTrue(false);
        }
    }


    @Test(priority = 1)
    public static void Test_1() {
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 1 running");
            Thread.sleep(6000); 

            element = homePageElements.home_button(driver);
            Thread.sleep(3000); 
            actor.click_homeButton(element);
            Thread.sleep(3000); 

            Thread.sleep(3000); 
            System.out.println("Test 1 success\n");



        } catch (Exception e) {
            System.out.println("Test 1 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 2)
    public static void Test_2() {
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 2 running");
            Thread.sleep(2000); 

            element = homePageElements.currentPaper_button(driver);
            Thread.sleep(3000); 
            actor.click_currentPaperButton(element);
            Thread.sleep(5000); 
            element = homePageElements.currentDate_box(driver);
            Thread.sleep(3000); 
            String newDate = actor.get_paperDate(element);
            Thread.sleep(3000); 
            assertTrue((currentDate.equals(newDate)));

            Thread.sleep(3000); 
            System.out.println("Test 2 success\n");

        } catch (Exception e) {
            System.out.println("Test 2 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 3)
    public static void Test_3() {
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 3 running");
            Thread.sleep(2000); 

            element = homePageElements.edition_box(driver);
            Thread.sleep(3000);
            assertTrue(actor.check_editionBox(element)); 
            
            Thread.sleep(3000); 
            System.out.println("Test 3 success\n");

        } catch (Exception e) {
            System.out.println("Test 3 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 4)
    public static void Test_4() {
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 4 running");
            Thread.sleep(2000); 

            element = homePageElements.page_box1(driver);
            Thread.sleep(3000);
            assertTrue(actor.check_pageBox(element)); 
            
            Thread.sleep(3000); 
            System.out.println("Test 4 success\n");

        } catch (Exception e) {
            System.out.println("Test 4 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 5)
    public static void Test_5() {
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 5 running");
            Thread.sleep(2000); 

            element = homePageElements.page_box2(driver);
            Thread.sleep(3000);
            actor.click_pageBox(element);
            Thread.sleep(3000);
            element = homePageElements.page_select(driver, "1");
            assertTrue(actor.check_pageBox(element)); 
            
            Thread.sleep(3000); 
            System.out.println("Test 5 success\n");

        } catch (Exception e) {
            System.out.println("Test 5 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 6)
    public static void Test_6() {
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 6 running");
            Thread.sleep(2000); 

            element = homePageElements.dateBox_button(driver);
            Thread.sleep(3000);
            actor.click_dateBox(element);
            Thread.sleep(3000);
            element = homePageElements.dateBox(driver);
            Thread.sleep(3000);
            assertTrue(actor.check_dateBox(element)); 
            
            Thread.sleep(3000); 
            System.out.println("Test 6 success\n");

        } catch (Exception e) {
            System.out.println("Test 6 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 7)
    public static void Test_7() {
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 7 running");
            Thread.sleep(2000); 

            element = homePageElements.edition_box(driver);
            Thread.sleep(3000);
            String oldPage = actor.get_edition(element);
            Thread.sleep(3000);
            actor.click_editionViaDropDown(element);
            Thread.sleep(3000);
            element = homePageElements.edition_box(driver);
            Thread.sleep(3000);
            String nextPage = actor.get_edition(element);
            Thread.sleep(3000);
            assertTrue(oldPage!=nextPage); 
            
            Thread.sleep(3000); 
            System.out.println("Test 7 success\n");

        } catch (Exception e) {
            System.out.println("Test 7 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 8)
    public static void Test_8() {
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 8 running");
            Thread.sleep(2000); 

            element = homePageElements.page_box1(driver);
            Thread.sleep(3000);
            String oldPage = actor.get_pageNumber(element);
            Thread.sleep(3000);
            actor.click_pageNumViaDropDown(element);
            Thread.sleep(5000);
            element = homePageElements.page_box1(driver);
            Thread.sleep(3000);
            String nextPage = actor.get_pageNumber(element);
            Thread.sleep(3000);
            assertTrue(oldPage!=nextPage); 
            
            Thread.sleep(3000); 
            System.out.println("Test 8 success\n");

        } catch (Exception e) {
            System.out.println("Test 8 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 9)                      
    public static void Test9() {
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 9 running");
            Thread.sleep(2000); 

            element = homePageElements.page_box1(driver);
            Thread.sleep(3000);
            String oldPage = actor.get_pageNumber(element);
            Thread.sleep(3000);
            element = homePageElements.page_box2(driver);
            Thread.sleep(3000);
            actor.click_pageBox(element);
            Thread.sleep(3000);
            element = homePageElements.page_select(driver, "2");
            Thread.sleep(6000);
            actor.click_pageNumViaBox(element);
            Thread.sleep(5000);
            element = homePageElements.page_box1(driver);
            Thread.sleep(3000);
            String nextPage = actor.get_pageNumber(element);
            Thread.sleep(3000);
            assertTrue(oldPage!=nextPage); 
            
            Thread.sleep(3000); 
            System.out.println("Test 9 success\n");

        } catch (Exception e) {
            System.out.println("Test 9 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 10)
    public static void Test10() {
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 10 running");
            Thread.sleep(2000); 

            element = homePageElements.page_box1(driver);
            Thread.sleep(3000);
            String prev = actor.get_pageNumber(element);
            Thread.sleep(3000);
            element = homePageElements.page_slider(driver);
            Thread.sleep(3000);
            actor.click_pageSlider(element);
            Thread.sleep(5000);
            element = homePageElements.page_box1(driver);
            Thread.sleep(3000);
            String next = actor.get_pageNumber(element);
            Thread.sleep(3000);
            assertTrue(prev!=next); 
            
            Thread.sleep(3000); 
            System.out.println("Test 10 success\n");

        } catch (Exception e) {
            System.out.println("Test 10 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 11)
    public static void Test11() {
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 11 running");
            Thread.sleep(2000); 

            elements = homePageElements.article_elms(driver);
            Thread.sleep(3000); 
            actor.click_article(elements);
            Thread.sleep(3000); 
            element = homePageElements.articleBox(driver);
            Thread.sleep(3000); 
            assertTrue(actor.check_articleBox(element)); 
            
            Thread.sleep(3000); 
            System.out.println("Test 11 success\n");

        } catch (Exception e) {
            System.out.println("Test 11 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 12)
    public static void Test12() {
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 12 running");
            Thread.sleep(2000); 

            element = homePageElements.share_button(driver);
            Thread.sleep(3000); 
            actor.click_shareButton(element);
            Thread.sleep(3000); 
            elements = homePageElements.share_options(driver);
            Thread.sleep(3000); 
            assertTrue(actor.check_shareOptions(elements[0])); 
            
            Thread.sleep(3000); 
            System.out.println("Test 12 success\n");

        } catch (Exception e) {
            System.out.println("Test 12 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 13)
    public static void Test13() { 
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 13 running");
            Thread.sleep(2000); 

            element = homePageElements.share_button(driver);
            Thread.sleep(3000); 
            actor.click_shareButton(element);
            Thread.sleep(3000); 
            elements = homePageElements.share_options(driver);
            Thread.sleep(3000); 
            assertTrue(actor.check_shareOptions(elements[0])); 
            Thread.sleep(3000); 
            actor.click_shareOptions(elements);
            
            Thread.sleep(3000); 
            System.out.println("Test 13 success\n");

        } catch (Exception e) {
            System.out.println("Test 13 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 14)
    public static void Test14() { 
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 14 running");
            Thread.sleep(2000); 

            element = homePageElements.dateBox_button(driver);
            Thread.sleep(3000);
            actor.click_dateBox(element);
            Thread.sleep(3000);
            element = homePageElements.dateBox(driver);
            Thread.sleep(3000);
            assertTrue(actor.check_dateBox(element)); 
            Thread.sleep(3000);
            elements = homePageElements.date_elms(driver);
            Thread.sleep(3000);
            actor.click_dateBoxDay(elements[0]);
            Thread.sleep(5000);
            element = homePageElements.dateBox_button(driver);
            Thread.sleep(3000);
            actor.click_dateBox(element);
            Thread.sleep(3000);
            element = homePageElements.dateBox(driver);
            Thread.sleep(3000);
            assertTrue(actor.check_dateBox(element)); 
            element = homePageElements.currentDate_box(driver);
            Thread.sleep(3000); 
            String newDate = actor.get_paperDate(element);
            Thread.sleep(3000); 
            assertFalse((currentDate.equals(newDate)));
            
            Thread.sleep(3000); 
            System.out.println("Test 14 success\n");

        } catch (Exception e) {
            System.out.println("Test 14 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 15)
    public static void Test15() { 
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 15 running");
            Thread.sleep(2000); 

            element = homePageElements.dateBox_button(driver);
            Thread.sleep(3000);
            actor.click_dateBox(element);
            Thread.sleep(3000);
            element = homePageElements.dateBox(driver);
            Thread.sleep(3000);
            assertTrue(actor.check_dateBox(element)); 
            Thread.sleep(3000);
            elements = homePageElements.date_elms(driver);
            Thread.sleep(3000);
            String currentMonth = actor.get_dateBoxMonth(elements);
            Thread.sleep(3000);
            actor.click_dateBoxMonthViaDropDown(elements[1]);
            Thread.sleep(3000); 
            elements = homePageElements.date_elms(driver);
            Thread.sleep(3000); 
            String newMonth = actor.get_dateBoxMonth(elements);
            Thread.sleep(3000);
            assertFalse((currentMonth.equals(newMonth)));
            
            Thread.sleep(3000); 
            System.out.println("Test 15 success\n");

        } catch (Exception e) {
            System.out.println("Test 15 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 16)
    public static void Test16() { 
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 16 running");
            Thread.sleep(2000); 

            element = homePageElements.dateBox_button(driver);
            Thread.sleep(3000);
            actor.click_dateBox(element);
            Thread.sleep(3000);
            element = homePageElements.dateBox(driver);
            Thread.sleep(3000);
            assertTrue(actor.check_dateBox(element)); 
            Thread.sleep(3000);
            element = homePageElements.dateMonthSlider(driver);
            Thread.sleep(3000);
            elements = homePageElements.date_elms(driver);
            Thread.sleep(3000);
            String currentMonth = actor.get_dateBoxMonth(elements);
            Thread.sleep(3000);
            actor.click_dateBoxMonthViaSlider(element);
            Thread.sleep(3000); 
            elements = homePageElements.date_elms(driver);
            Thread.sleep(3000); 
            String newMonth = actor.get_dateBoxMonth(elements);
            Thread.sleep(3000);
            assertFalse((currentMonth.equals(newMonth)));
            
            Thread.sleep(3000); 
            System.out.println("Test 16 success\n");

        } catch (Exception e) {
            System.out.println("Test 16 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 17)
    public static void Test17() { 
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 17 running");
            Thread.sleep(2000); 

            element = homePageElements.dateBox_button(driver);
            Thread.sleep(3000);
            actor.click_dateBox(element);
            Thread.sleep(3000);
            element = homePageElements.dateBox(driver);
            Thread.sleep(3000);
            assertTrue(actor.check_dateBox(element)); 
            Thread.sleep(3000);
            elements = homePageElements.date_elms(driver);
            Thread.sleep(3000);
            String currentYear = actor.get_dateBoxYear(elements);
            Thread.sleep(3000);
            actor.click_dateBoxYear(elements[2]);
            Thread.sleep(3000); 
            elements = homePageElements.date_elms(driver);
            Thread.sleep(3000); 
            String newYear = actor.get_dateBoxYear(elements);
            Thread.sleep(3000);
            assertFalse((currentYear.equals(newYear)));
            
            Thread.sleep(3000); 
            System.out.println("Test 17 success\n");

        } catch (Exception e) {
            System.out.println("Test 17 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 18)
    public static void Test18() { 
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 18 running");
            Thread.sleep(2000); 

            elements = homePageElements.article_elms(driver);
            Thread.sleep(3000); 
            actor.click_article(elements);
            Thread.sleep(3000); 
            element = homePageElements.articleBox(driver);
            Thread.sleep(3000); 
            assertTrue(actor.check_articleBox(element)); 
            Thread.sleep(3000); 
            Thread.sleep(4000); 
            actor.click_articleZoom();
            
            Thread.sleep(3000); 
            System.out.println("Test 18 success\n");

        } catch (Exception e) {
            System.out.println("Test 18 failed\n");
            assertTrue(false);
        }
    }

    @Test(priority = 19)
    public static void Test19() { 
        try {
            // Thread.sleep(4000); 
            System.out.println("Test 19 running");
            Thread.sleep(2000); 

            elements = homePageElements.article_elms(driver);
            Thread.sleep(3000); 
            actor.click_article(elements);
            Thread.sleep(3000); 
            element = homePageElements.articleBox(driver);
            Thread.sleep(3000); 
            assertTrue(actor.check_articleBox(element)); 
            Thread.sleep(3000); 
            String oldSize = actor.get_articleBoxLocation(element);
            Thread.sleep(3000); 
            element = homePageElements.articleBoxDragBar(driver);
            Thread.sleep(3000); 
            actor.clickDrag_articleBox(element);
            Thread.sleep(3000); 
            element = homePageElements.articleBox(driver);
            Thread.sleep(3000); 
            String newSize = actor.get_articleBoxLocation(element);
            Thread.sleep(3000); 
            assertFalse(oldSize.equals(newSize));
            
            Thread.sleep(3000); 
            System.out.println("Test 19 success\n");

        } catch (Exception e) {
            System.out.println("Test 19 failed\n");
            assertTrue(false);
        }
    }


    @AfterMethod
    public static void closeDown(){
        driver.quit();
    }
}

