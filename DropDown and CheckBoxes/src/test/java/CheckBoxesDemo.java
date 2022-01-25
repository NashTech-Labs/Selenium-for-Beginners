import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;


public class CheckBoxesDemo extends Browser {

    @Test
    public void test() throws InterruptedException, IOException {
        driver = initializeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Checkboxes')]")).click();
        List<WebElement> checkboxElements = driver.findElements(By.cssSelector("#checkboxes input[type='checkbox']"));
        //To select the checkbox which is not selected
        System.out.println("no of checkboxes are : "+checkboxElements.size());
        for(WebElement checkbox:checkboxElements) {
            System.out.println("is this selected : "+checkbox.isSelected());
            if(!checkbox.isSelected()) {
                Thread.sleep(2000);
                checkbox.click();
            }
        }
        driver.close();
    }
}
