import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FluentWaitDemo extends  Browser{
    /*
    * This code will show the wait condition within a range to find out Contact Us button
    * */
    @Test
    @Deprecated
    public void demoFluentWait () throws IOException {
        driver = initializeDriver();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.get(prop.getProperty("website"));

        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(10, TimeUnit.SECONDS);
        wait.pollingEvery(2, TimeUnit.SECONDS);
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Contact Us']")));
        driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
        driver.quit();
    }
}
