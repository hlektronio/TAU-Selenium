package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
        var hoversPage =  homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);

        assertTrue(caption.isCaptionDisplayed(),"Caption is not displayed");
        assertEquals(caption.getTitle(),"name: user1", "Caption is not correct");
        assertEquals(caption.getLinkText(),"View profile","Link text is incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"),"Link is not correct");

    }
}
