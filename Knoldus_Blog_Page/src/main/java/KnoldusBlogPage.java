import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KnoldusBlogPage {

    WebDriver driver;
    public KnoldusBlogPage(WebDriver driver) {
        this.driver = driver;
    }

    By insightmenu = By.xpath("//a[text()='Insights']");
    By blog = By.xpath("//a[@rel='noopener noreferrer']//child::h5[text()='Blogs']");
    By emailIdinputbox = By.xpath("//input[@placeholder='Email Address']");
    By subscribe = By.xpath("//button[@class='wp-block-button__link']");


    public By getinsight() {
        return insightmenu;
    }
    public By getblog() {
        return blog;
    }
    public By getEmailIdinputbox() {
        return emailIdinputbox;
    }public By getSubscribe() {
        return subscribe;
    }

    public WebElement click_On_insight(){

        return driver.findElement(insightmenu);
    }
       public WebElement click_Onblog(){
        return driver.findElement(blog);
    }
    public WebElement click_Onemailid(){
        return driver.findElement(emailIdinputbox);

    }public WebElement click_Onsubscribe(){
        return driver.findElement(subscribe);

    }
}
    
