import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class DropDownDemo extends  Browser{
    @Test
    public void Check() throws IOException, InterruptedException {
        driver = initializeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Dropdown')]")).click();
        Thread.sleep(2000);
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        Thread.sleep(2000);
        select.selectByValue("2");
        driver.close();
    }
}
