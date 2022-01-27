import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DragandDrop_offSetTest extends Browser {
    @Before
    public void setup() throws IOException {

        driver = initializeDriver();
        driver.get(prop.getProperty("test1"));
    }
    @Test
    public void blogpage() throws InterruptedException {

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        Actions builder = new Actions(driver);

        WebElement source = driver.findElement(By.id("draggable"));

        WebElement destination = driver.findElement(By.id("droppable"));

        int xOffset1 = source.getLocation().getX();
        int yOffset1 = source.getLocation().getY();

        System.out.println("xOffset1--->" + xOffset1 + " yOffset1--->" + yOffset1);

        int xOffset = destination.getLocation().getX();
        int yOffset = destination.getLocation().getY();

        System.out.println("xOffset--->" + xOffset + " yOffset--->" + yOffset);

        //Find the xOffset and yOffset difference to find x and y offset needed in which from object required to dragged and dropped
        xOffset = (xOffset - xOffset1) + 15;
        yOffset = (yOffset - yOffset1) + 10;

        builder.dragAndDropBy(source, xOffset, yOffset).perform();

        String textTo = destination.getText();

        if (textTo.equals("Dropped!")) {
            System.out.println("PASS: Source is dropped at location as expected");
        } else {
            System.out.println("FAIL: Source couldn't be dropped at location as expected");
        }
    }
}
