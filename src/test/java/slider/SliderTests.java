package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void testSlider(){
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.moveSliderToFour();
        assertEquals(horizontalSliderPage.getRange(),"4");
    }
}
