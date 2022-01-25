import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ScrollRightDemo extends  Browser{
    @Test
    public void Check() throws  IOException {
        driver = initializeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/large");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        WebElement Element = driver.findElement(By.xpath("//span[text()='40']"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        driver.close();
    }
}
