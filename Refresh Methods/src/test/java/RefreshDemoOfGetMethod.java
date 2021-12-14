import org.junit.Test;
import java.io.IOException;

public class RefreshDemoOfGetMethod extends  Browser{

    @Test
    public void Check() throws  IOException {
        driver = initializeDriver();
        driver.get("https://www.knoldus.com/home");
        driver.get(driver.getCurrentUrl());
        driver.close();
    }
}
