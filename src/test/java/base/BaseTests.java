package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement shiftContentLink = driver.findElement(By.linkText("Shifting Content"));
        shiftContentLink.click();

        WebElement menuElement = driver.findElement(By.partialLinkText("Menu Element"));
        menuElement.click();

        List <WebElement> menuItems = driver.findElements(By.tagName("li"));
        System.out.println(menuItems.size());

        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String args[]){
        BaseTests tests = new BaseTests();
        tests.setUp();
    }
}
