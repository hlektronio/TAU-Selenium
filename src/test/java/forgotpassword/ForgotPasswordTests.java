package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testForgotPassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.writeEmail("ele@ff.ww");
        EmailSentPage emailSentPage = forgotPasswordPage.clickSubmit();

        assertEquals("Your e-mail's been sent!",emailSentPage.EmailSentPageConfirmation());
    }
}
