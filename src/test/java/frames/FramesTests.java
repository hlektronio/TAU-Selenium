package frames;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.NestedFramesPage;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTests {

    @Test
    public void testGetMultipleFramesText(){
        var framesPage = homePage.clickFrames();
        var nestedFramesPage = framesPage.clickNestedFrames();

        assertEquals(nestedFramesPage.getFirstFramesText(),"LEFT");
        assertEquals(nestedFramesPage.getLastFramesText(),"BOTTOM");
    }
}
