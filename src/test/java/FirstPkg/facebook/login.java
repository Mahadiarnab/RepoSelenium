package FirstPkg.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
    //Steps to login:
    //        * 1. Open facebook.com
    //        * 2. Click username box
    //        * 3. Type user-email address --> sendKeys()
    //        * 4. Click password box
    //        * 5. Type user-password --> sendKeys()
    //        * 6. Click Login button --> click();
    @Test
    public void facebooklogin(){
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url= "https://www.facebook.com/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.findElement(By.name("email")).click();
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.name("email")).sendKeys("test1234@gmail.com");
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.name("pass")).click();
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.name("pass")).sendKeys("test1234");
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.id("loginbutton")).click();
        try{
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

            driver.close();


    }
}
