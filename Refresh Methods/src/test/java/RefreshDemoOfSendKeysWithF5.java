import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;

public class RefreshDemoOfSendKeysWithF5 extends  Browser{

    @Test
    public void Check() throws  IOException {

        driver = initializeDriver();
        driver.get("https://www.youtube.com/");
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search']")));
        element1.click();
        element1.sendKeys("Knoldus Inc.");
        element1.sendKeys(Keys.F5);
        driver.close();
    }
}
