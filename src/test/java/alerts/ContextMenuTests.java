package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testRightClick(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClick();
        assertEquals(contextMenuPage.getAlertText(),"You selected a context menu",
                "Menu context text is incorrect");
        contextMenuPage.acceptAlert();

    }
}
