import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import java.io.IOException;

public class ScrollUpDemo extends  Browser{
    @Test
    public void Check() throws IOException, InterruptedException {
        driver = initializeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.knoldus.com/home");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-350)", "");
        driver.close();
    }
}
