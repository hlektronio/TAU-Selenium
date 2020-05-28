package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

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
}
