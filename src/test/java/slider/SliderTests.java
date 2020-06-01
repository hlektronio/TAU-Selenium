package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.AssertJUnit.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void testSlider(){
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.moveSliderToFour();
        assertEquals("4",horizontalSliderPage.getRange());
    }
}
