import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import java.io.IOException;

public class PromptDemo extends  Browser{
    @Test
    public  void check() throws NoAlertPresentException, IOException {
        driver = initializeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Selenium");
        alert.accept();
        driver.close();
    }
}
