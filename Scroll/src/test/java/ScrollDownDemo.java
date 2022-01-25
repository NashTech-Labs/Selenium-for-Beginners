import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import java.io.IOException;

public class ScrollDownDemo extends  Browser{
    @Test
    public void Check() throws  IOException {
        driver = initializeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.knoldus.com/home");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        driver.close();
    }
}
