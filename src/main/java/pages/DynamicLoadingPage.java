package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By secondLink = By.xpath("//*[@id=\"content\"]/div/a[2]");


    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample2Page clickSecondLink(){
        driver.findElement(secondLink).click();
        return new DynamicLoadingExample2Page(driver);
    }

//    public DynamicLoadingExample2Page rightClickSecondLink(){
//        Actions action = new Actions(driver);
//        action.contextClick(driver.findElement(secondLink)).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ENTER).build().perform();;
//        return new DynamicLoadingExample2Page(driver);
//    }

}
