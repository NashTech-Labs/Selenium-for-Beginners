import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class Search_On_YoutubeTest extends Browser {
    @Before
    public void setup() throws IOException {

        driver = initializeDriver();
        driver.get(prop.getProperty("Url1"));  //Url2
    }
    @Test
    public void check() throws InterruptedException {

        Search_On_Youtube search_on_youtube = new Search_On_Youtube(driver);
        WebDriverWait wait = new WebDriverWait(driver, 5);

        wait.until(ExpectedConditions.visibilityOfElementLocated(search_on_youtube.getSearch_box()));
        search_on_youtube.click_On_search_box().click();
        search_on_youtube.click_On_search_box().sendKeys("Knoldus Inc");
        search_on_youtube.click_On_search_box().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(search_on_youtube.getKnoldus_title()));
        search_on_youtube.click_On_Knoldus_title().click();

//        wait.until(ExpectedConditions.visibilityOfElementLocated(search_on_youtube.getSubscribe_button()));
//        search_on_youtube.click_On_subscribe_button().click();

        //Click on first video
        wait.until(ExpectedConditions.visibilityOfElementLocated(search_on_youtube.getvideo()));
        search_on_youtube.click_On_video().click();

        Thread.sleep(3000);
        driver.quit();
    }
}