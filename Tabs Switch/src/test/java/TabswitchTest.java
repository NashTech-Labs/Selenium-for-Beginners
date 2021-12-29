import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.ArrayList;

public class TabswitchTest extends Browser {
    @Before
    public void setup() throws IOException {

        driver = initializeDriver();
        driver.get(prop.getProperty("test"));
    }
    @Test
    public void tabSwitchTest() throws InterruptedException {

        Tabswitch tabswitch = new Tabswitch(driver);
        WebDriverWait wait = new WebDriverWait(driver, 20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(tabswitch.getinsight()));
        tabswitch.click_On_insight().click();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(tabswitch.getblog()));
        tabswitch.click_Onblog().click();

        Thread.sleep(2000);

        /* code for Tab switch left to right */
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));

        wait.until(ExpectedConditions.visibilityOfElementLocated(tabswitch.getEmailId()));
        tabswitch.click_Onemailid().click();
        tabswitch.click_Onemailid().clear();
        tabswitch.click_Onemailid().sendKeys("xyz@knoldus.com");
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(tabswitch.getSubscribe()));
        tabswitch.click_Onsubscribe().click();
        
        Thread.sleep(2000);
        driver.quit();

    }
}     
  
