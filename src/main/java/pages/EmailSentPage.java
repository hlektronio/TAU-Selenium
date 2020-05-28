package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {

    private WebDriver driver;
    private By content = By.cssSelector("#content");

    public EmailSentPage(WebDriver driver){
        this.driver = driver;
    }
    public String EmailSentPageTitle(){
        return driver.findElement(content).getText();
    }
}
