import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.io.IOException;

public class ScrollUntilElementFoundDemo extends  Browser{
    @Test
    public void Check() throws IOException, InterruptedException {
        driver = initializeDriver();
        driver.manage().window().maximize();
        driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.xpath("//span[text()='See also']"));
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);
        Element.click();
        driver.close();
    }
}
