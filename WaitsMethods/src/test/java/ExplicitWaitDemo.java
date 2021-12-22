import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ExplicitWaitDemo extends Browser {
/*
* This file gives the demo where it opens Knoldus website
* And click on contact button and subscribe the newsletter popup message.
* */
    @Test
    public void demoExplicitWait () throws IOException, InterruptedException {
        driver = initializeDriver();
        driver.get(prop.getProperty("website"));
        WebDriverWait wait = new WebDriverWait(driver, 15);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Contact Us']")));
        driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='SUBSCRIBE NOW']")));
        driver.findElement(By.xpath("//button[text()='SUBSCRIBE NOW']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='name']")));
        driver.findElement(By.xpath("//input[@name='name']")).click();
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Demo");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
        driver.findElement(By.xpath("//input[@name='email']")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("useremail@domain.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='SUBSCRIBE NOW']")));
        driver.findElement(By.xpath("//button[text()='SUBSCRIBE NOW']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
