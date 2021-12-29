import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.ArrayList;

public class TabswitchforcurrenttabTest extends Browser {
    @Before
    public void setup() throws IOException {

        driver = initializeDriver();
        driver.get(prop.getProperty("test"));
    }

    @Test
    public void tabSwitch_currenttab() throws InterruptedException {

        Tabswitch tabswitch = new Tabswitch(driver);
        WebDriverWait wait = new WebDriverWait(driver, 20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(tabswitch.getinsight()));
        tabswitch.click_On_insight().click();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(tabswitch.getblog()));
        tabswitch.click_Onblog().click();
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        System.out.println("Page title of new tab: " + driver.getTitle());
        Thread.sleep(2000);

        /* code for Tab switch to current tab */
        driver.switchTo().window(newTb.get(0));
        driver.quit();

    }
}     
  
