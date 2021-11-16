import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class SearchOnYoutubeTest extends Browser {
    @Before
    public void setup() throws IOException {

        driver = initializeDriver();
        driver.get(prop.getProperty("youtube"));
    }
    @Test
    public void search_and_play_on_Youtube() throws InterruptedException {

        SearchOnYoutube search_on_youtube = new SearchOnYoutube(driver);
        WebDriverWait wait = new WebDriverWait(driver, 20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(search_on_youtube.getSearch_box()));
        search_on_youtube.click_On_search_box().click();
        search_on_youtube.click_On_search_box().sendKeys("Knoldus Inc");
        search_on_youtube.click_On_search_box().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(search_on_youtube.getKnoldus_title()));
        search_on_youtube.click_On_Knoldus_title().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(search_on_youtube.getvideo()));
        search_on_youtube.click_On_video().click();

        Thread.sleep(3000);
    }
}     
  
