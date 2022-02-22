import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DragandDropTest extends Browser {
    @Before
    public void setup() throws IOException {

        driver = initializeDriver();
        driver.get(prop.getProperty("test1"));
    }
    @Test
    public void blogpage() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        Actions builder = new Actions(driver);

        WebElement source  = driver.findElement(By.id("draggable"));
        WebElement destination = driver.findElement(By.id("droppable"));

        builder.dragAndDrop(source, destination).perform();

        String textTo = destination.getText();

        if (textTo.equals("Dropped!")) {
            System.out.println("PASS: Source is dropped to target as expected");
        } else {
            System.out.println("FAIL: Source couldn't be dropped to target as expected");
        }

    }
}



