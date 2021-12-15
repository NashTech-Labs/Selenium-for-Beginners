import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Handleiframe {

    WebDriver driver;
    public Handleiframe(WebDriver driver) {
        this.driver = driver;
    }

    By search_box = By.xpath("//textarea[@id='code']");

    public By getSearch_box() {
        return search_box;
    }
    public WebElement click_On_search_box(){
        return driver.findElement(search_box);
    }

}
    
