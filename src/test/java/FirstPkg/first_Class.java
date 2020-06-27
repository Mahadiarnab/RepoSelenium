package FirstPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class first_Class {
   @Test
    public void launchpage() {
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url= "https://www.facebook.com/";
        driver.get(url);

        // how to maximize page
        driver.manage().window().maximize();

        String actualPageUrl= driver.getCurrentUrl();

        String expectedPageUrl= "https://www.facebook.com/";

       Assert.assertEquals(actualPageUrl,expectedPageUrl);

       String currentUrl = driver.getCurrentUrl();

      // how to find url/ page title in the console webpage
       System.out.println("current url " + driver.getCurrentUrl());

       System.out.println("current page title " + driver.getTitle());

       // how to refresh web page(1)
       driver.navigate().refresh();

       // how to refresh web page(2) launch current url
       driver.get(driver.getCurrentUrl());

       //how to refresh web page(3)  go back and then forward
       driver.navigate().back();
       driver.navigate().forward();

       // how to find locators
       // Locator : It's address of webElement using which Selenium is able to interact with webElement.
       //     *
       //     * Locator are getting created using "By" class.
       //     *
       //     * We find the address (String) for webelement
       //     * We feed the address (String) into appropriate method of By class --> Locator (datatype = By)
       //     * We feed the Locator into a method (findElement) --> WebElement (Datatype = WebElement)
       //     * Using webElement, we do interaction needed as per test-step.
       //     */
          driver.findElement(By.id("loginbutton")).click();
          driver.findElement(By.linkText("Terms")).click();
          driver.findElement(By.partialLinkText("Data")).click();
          //Types of Locator:
       //     * 1. id         - using chropath using == //*[@id=...]
       //     * 2. className-   samething as id done in the above - using chropath using == //*[@id=...]
       //     * 3. name-  "                      - using chropath using == //*[@id=...]
       //     * 4. tagName-" -                     - using chropath using == //
       //     * 5. linkText [Link is a clickable Text; and always comes with 'a' tag]
       //     *      [link mentioned with 'href' attribute is going to open after clicking the link]
       //     * 6. partialLinkText
       //     * 7. xPath <- MOST IMPORTANT
       //     * 8. CSS





       /**
        * Steps to login:
        * 1. Open facebook.com
        * 2. Click username box
        * 3. Type user-email address --> sendKeys()
        * 4. Click password box
        * 5. Type user-password --> sendKeys()
        * 6. Click Login button --> click();
        */
       // 2,3
      // By emailLocator = By.name("email");
      // WebElement emailBox = driver.findElement(emailLocator);
      // emailBox.sendKeys("test@email.com");
       driver.findElement(By.name("email")).sendKeys("test@email.com");

       try {
           Thread.sleep(2000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       // 4,5
      // By passLocator = By.id("pass");
       //WebElement passBox = driver.findElement(passLocator);
      // passBox.sendKeys("test@1234");
       driver.findElement(By.id("pass")).sendKeys("test@1234");

       try {
           Thread.sleep(2000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       // 6
      // By loginButtonLocator = By.id("loginbutton");
      // WebElement loginButton = driver.findElement(loginButtonLocator);
      // loginButton.click();
       driver.findElement(By.id("loginbutton")).click();



         // how to time expand for your webp
       try {
           Thread.sleep(10000);
       }catch (InterruptedException e) {
            e.printStackTrace();
        }

       // to close the web page (1) will close all the linked window
         driver.close();
       // to close the web page (2) will close all the open window
         driver.quit();

    }
}
