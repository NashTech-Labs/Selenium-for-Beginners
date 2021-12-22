import org.junit.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PageLoadTimeoutDemo extends  Browser{

   /*
   * This code will open the Knoldus company website and waits for the given time
   * to load the website
   * */
    @Test
    public void demoPageLoadTime () throws IOException {
        driver = initializeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(prop.getProperty("website"));
        driver.quit();
    }
}
