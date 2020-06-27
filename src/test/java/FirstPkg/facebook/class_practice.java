package FirstPkg.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class class_practice {
    /* 1. Launch facebook.com
     * 2. verify your gender radio-button is not selected
     * 3. if your gender radio-button is not selected; then select the same
     * 4. verify the gender radio-button is now selected
     */
    @Test
    public  void verify(){
       System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
       WebDriver driver = new ChromeDriver();
       String url= "https://www.facebook.com/";
       driver.get(url);
       driver.manage().window().maximize();
        //Assert.assertTrue();
       driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();

       //Assert.assertTrue(new Boolean("//input[@type='radio' and @value='2']"));
        // 1. find locator
        By monthDropdownLocator = By.id("month");
        // 2. find dropdown web-element
        WebElement monthDropdown = driver.findElement(monthDropdownLocator);
        // 3. Create object of Select Class and provide dropdownWebElement as input to Constructor.
        Select month = new Select(monthDropdown);
        // 4. use Select object to pick any value.
        month.selectByVisibleText("May");
        By dateDropDown = By.id("Day");
        WebElement datedrop = driver.findElement(dateDropDown);
        Select date = new Select(datedrop);
        date.selectByVisibleText("1");
        By yearDrop =By.id("year");
        WebElement yearDroop= driver.findElement(yearDrop);
        Select year = new Select(yearDroop);
        year.selectByVisibleText("2020");


    }
}
