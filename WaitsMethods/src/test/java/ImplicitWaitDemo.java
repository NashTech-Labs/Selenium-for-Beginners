import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo extends Browser {
/*
* This code will demonstrate where it opens website of Knoldus company
* and waits Implicitly for the given time to find out the Contact Us button.
* */
    @Test
    public void demoImplicitWait () throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("website"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
        driver.quit();
    }
}
