package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePasswordButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

//    public void clickEmailField(){
//    }

    public void writeEmail(String email){
        driver.findElement(emailField).click();
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailSentPage clickSubmit(){
        driver.findElement(retrievePasswordButton).click();
        return new EmailSentPage(driver);
    }
}
