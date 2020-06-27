package FirstPkg.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class home_work1 {
   /* 1. Login to Facebook
     * 2. Fill below data in Sign Up form
     *      First name
     *      Last name
     *      Email-address
     *      Password(s)
     *      Click Sign Up button
     * 3. Verify Error msg : "Please choose a gender. You can change who can see this later."
            */
    @Test
 public  void faceBookLogin(){
     System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
     WebDriver driver = new ChromeDriver();
     String url= "https://www.facebook.com/";
     driver.get(url);
     driver.manage().window().maximize();driver.findElement(By.name("email")).click();
     try{
         Thread.sleep(2000);
     } catch (InterruptedException e){
         e.printStackTrace();
     }
     driver.findElement(By.name("email")).sendKeys("test1234@gmail.com");
     try{
         Thread.sleep(2000);
     } catch (InterruptedException e){
         e.printStackTrace();
     }
     driver.findElement(By.name("pass")).click();
     try{
         Thread.sleep(2000);
     } catch (InterruptedException e){
         e.printStackTrace();
     }
     driver.findElement(By.name("pass")).sendKeys("test1234");
     try{
         Thread.sleep(2000);
     } catch (InterruptedException e){
         e.printStackTrace();
     }

     driver.findElement(By.name("firstname")).sendKeys("abcd");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
     driver.findElement(By.name("lastname")).sendKeys("kbdf");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
     driver.findElement(By.xpath("//*[@aria-label='Mobile number or email']")).sendKeys("test12345");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
     driver.findElement(By.xpath("//*[@aria-label='New password']")).sendKeys("12345678");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
     driver.findElement(By.xpath("//button[text()='Sign Up' and @name='websubmit']")).click();

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

     String actualPageErrorMsg = "Please choose a gender. You can change who can see this later.";

        System.out.println("actualPageErrorMsg  -> " + actualPageErrorMsg);

     String expectedPageErrorMsg = driver.findElement(By.xpath("//div[contains(text(),'Please choose')]")).getText();

        System.out.println("expectedPageErrorMsg -> " + expectedPageErrorMsg);

     Assert.assertEquals(actualPageErrorMsg,expectedPageErrorMsg);
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }


     driver.close();


 }
}

