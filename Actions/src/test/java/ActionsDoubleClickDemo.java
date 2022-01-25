import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;

public class ActionsDoubleClickDemo extends  Browser{
    @Test
    public void Check() throws  IOException {
        driver = initializeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Actions action = new Actions(driver);
        WebElement webElement=driver.findElement(By.linkText("Sign in"));
        action.doubleClick(webElement).perform();
        driver.close();
    }
}
