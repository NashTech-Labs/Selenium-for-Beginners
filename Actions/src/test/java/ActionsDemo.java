import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class ActionsDemo extends  Browser{

    @Test
    public void Check() throws  IOException {
        driver = initializeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.knoldus.com/home");
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.linkText("Services"));
        action.moveToElement(element).click();
        driver.close();
    }
}
