import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class NameLocatorDemo extends  Browser{
    @Test
    public void Check() throws  IOException {
        driver = initializeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://login.yahoo.com/");
        driver.findElement(By.name("username")).sendKeys("demo@knoldus.com");
        WebElement searchIcon = driver.findElement(By.name("signin"));
        searchIcon.click();
        driver.close();
    }
}
