import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class HandleiframeTest extends Browser {
    @Before
    public void setup() throws IOException {

        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
    }
    @Test
    public void handleIframes() throws InterruptedException {

        Handleiframe handleiframe = new Handleiframe(driver);
        WebDriverWait wait = new WebDriverWait(driver, 20);

       Thread.sleep(2000);

       /*
        WebElement iframeElement = driver.findElement(By.xpath("//iframe[@title='Active learning classic embedding uses sample']"));
        driver.switchTo().frame(iframeElement);
*/
        driver.switchTo().frame(0);
        wait.until(ExpectedConditions.visibilityOfElementLocated(handleiframe.getSearch_box()));
        handleiframe.click_On_search_box().click();
        handleiframe.click_On_search_box().sendKeys("Welcome to Knoldus.");

        Thread.sleep(2000);
        driver.quit();
    }
}     
  
