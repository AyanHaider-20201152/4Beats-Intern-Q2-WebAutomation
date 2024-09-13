
package fbeats_q2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest{

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        
        try {
            Thread.sleep(4000); 
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        driver.close();
    }
}