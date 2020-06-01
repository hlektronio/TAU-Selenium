package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    WebDriver driver;
    By rightClickArea = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void rightClick(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(rightClickArea)).perform();

    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();

    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }


}
