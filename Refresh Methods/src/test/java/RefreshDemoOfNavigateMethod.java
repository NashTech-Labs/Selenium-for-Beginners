import org.junit.Test;
import java.io.IOException;

public class RefreshDemoOfNavigateMethod extends  Browser{

    @Test
    public void Check() throws  IOException {

        driver = initializeDriver();
        driver.get("https://www.knoldus.com/home");
        driver.navigate().to(driver.getCurrentUrl());
        driver.close();
    }
}
