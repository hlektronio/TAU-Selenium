package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    WebDriver driver;
    By slider = By.cssSelector(".sliderContainer input");
    By range = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveSliderToFour(){
        driver.findElement(slider).click();
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT);

    }

    public String getRange(){
        return driver.findElement(range).getText();

    }
}
