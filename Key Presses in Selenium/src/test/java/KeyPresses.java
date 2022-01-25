import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;

public class KeyPresses extends  Browser{
    @Test
    public void check() throws  IOException {

        driver = initializeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Key Presses')]")).click();
        Actions action = new Actions(driver);
        action.sendKeys("A").perform();;
        System.out.println(driver.findElement(By.cssSelector("p#result")).getText());
        driver.quit();
    }
}
