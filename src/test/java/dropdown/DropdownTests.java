package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        DropdownPage dropdownPage = homePage.clickDropdown();
        String option = "Option 1";
        dropdownPage.selectOptionFromDropdown(option);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option));
    }

    @Test
    public void testMutlipleSelection(){
        DropdownPage dropdownPage = homePage.clickDropdown();
        dropdownPage.changeMenuToMultipleSelections();
        String option1 = "Option 1";
        String option2 = "Option 2";
        ArrayList<String> options = new ArrayList<>();
        options.add(option1);
        options.add(option2);
        dropdownPage.selectMultipleOptionsFromDropdown(option1, option2);
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),2,"Number of selected options is incorrect");
        assertTrue(selectedOptions.containsAll(options));
    }
}
