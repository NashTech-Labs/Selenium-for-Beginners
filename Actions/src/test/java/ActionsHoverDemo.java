import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class ActionsHoverDemo extends  Browser{

    @Test
    public void Check() throws  IOException {
        driver = initializeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("Sign in"))).click().build().perform();
        driver.close();
    }
}
