import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import java.io.IOException;

public class ScrollDownTillLastDemo extends  Browser{
    @Test
    public void Check() throws  IOException {
        driver = initializeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.knoldus.com/connect/contact-us");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        driver.close();
    }
}
