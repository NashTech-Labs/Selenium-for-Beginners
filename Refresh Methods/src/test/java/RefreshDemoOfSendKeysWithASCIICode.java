import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;

public class RefreshDemoOfSendKeysWithASCIICode extends  Browser{

    @Test
    public void Check() throws  IOException {

        driver = initializeDriver();
        driver.get("https://www.youtube.com/");
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        WebElement element2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search']")));
        element2.click();
        element2.sendKeys("Knoldus Inc.");
        element2.sendKeys("\uE035");
        driver.close();
    }
}
