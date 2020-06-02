package dynamicloading;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends BaseTests {

    @Test
    public void testDynamicLoading(){
        var DynamicLoadingpage = homePage.clickDynamicLoading();
        var DynamicLoadingexample2 = DynamicLoadingpage.clickSecondLink();
        DynamicLoadingexample2.clickStartButton();
        String text = DynamicLoadingexample2.getTextFromLoadedElement();
        assertEquals(text,"Hello World!", "Text is incorrect");
    }
}
