import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchOnYoutube {

    WebDriver driver;
    public SearchOnYoutube(WebDriver driver) {
        this.driver = driver;
    }


    By search_box = By.xpath("//input[@id='search']");
    By Knoldus_title = By.xpath("//yt-formatted-string[@id='text' and text()='Knoldus Inc.']");
    By subscribe_button = By.xpath("//a[@id='video-title']");
            //By.xpath("//div[@id='subscribe-button']//parent::div[@id='buttons']");
    By search_button=By.xpath("//ytd-searchbox[@role='search' and @id='search']");
    By video= By.xpath("//a[@id='video-title' and@class='yt-simple-endpoint style-scope ytd-grid-video-renderer']");


    public By getSearch_box() {
        return search_box;
    }
    public By getKnoldus_title() { return Knoldus_title; }
    public By getSubscribe_button() {return subscribe_button;}
    public By getSearch_button() {
        return search_button;
    }
    public By getvideo() {return video; }


    public WebElement click_On_search_box(){
        return driver.findElement(search_box);
    }
    public WebElement click_On_Knoldus_title(){
        return driver.findElement(Knoldus_title);
    }
    public WebElement click_On_subscribe_button(){
        return driver.findElement(subscribe_button);
    }
    public WebElement click_On_video(){return driver.findElement(video);}


}
