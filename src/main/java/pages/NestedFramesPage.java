package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {


    WebDriver  driver;

    private By body = By.tagName("body");

    private String firstFrameName = "frame-left";
    private String lastFrameName = "frame-bottom";
    private String topRow = "frame-top";


    public NestedFramesPage(WebDriver driver){
        this.driver= driver;
    }

    public String getFirstFramesText(){
        switchToFTopRow();
        switchToFirstFrame();
        String text = driver.findElement(body).getText();
        switchToMainArea();
        switchToMainArea();
        return text;
    }

    public String getLastFramesText(){
        switchToLastFrame();
        String text = driver.findElement(body).getText();
        switchToMainArea();
        return text;
    }

    private void switchToFTopRow(){
        driver.switchTo().frame(topRow);
    }

    private void switchToFirstFrame(){
        driver.switchTo().frame(firstFrameName);
    }
    private void switchToLastFrame(){
        driver.switchTo().frame(lastFrameName);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
