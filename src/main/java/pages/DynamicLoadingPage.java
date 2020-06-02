package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}
