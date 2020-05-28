package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectOptionFromDropdown(String option) {
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions() {
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        ArrayList<String> selectedElementValues = new ArrayList<>();

        for (WebElement e : selectedElements) {
            String text = e.getText();
            selectedElementValues.add(text);
        }
        return selectedElementValues;

        /* Easiest and more sophisticated way to add element String values to a list

        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());

         */

    }

    private Select findDropDownElement() {
        return new Select(driver.findElement(dropdown));

    }
}
