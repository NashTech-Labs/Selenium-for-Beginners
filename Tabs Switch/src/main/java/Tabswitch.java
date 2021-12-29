import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tabswitch {

    WebDriver driver;
    public Tabswitch(WebDriver driver) {
        this.driver = driver;
    }

    By insight = By.xpath("//a[text()='Insights']");
    By blog = By.xpath("//a[@rel='noopener noreferrer']//child::h5[text()='Blogs']");
    By emailId = By.xpath("//input[@placeholder='Email Address']");
    By subscribe = By.xpath("//button[@class='wp-block-button__link']");

    public By getinsight() {
        return insight;
    }
    public By getblog() {
        return blog;
    }
    public By getEmailId() {
        return emailId;
    }public By getSubscribe() {
        return subscribe;
    }

    public WebElement click_On_insight(){

        return driver.findElement(insight);
    }
       public WebElement click_Onblog(){
        return driver.findElement(blog);
    }
    public WebElement click_Onemailid(){
        return driver.findElement(emailId);

    }public WebElement click_Onsubscribe(){
        return driver.findElement(subscribe);

    }
}
    
