package assertion;

import org.junit.Assert;
import state.LoginPageState;

public class PageAssertions {

    public void assertLoginPageLabels(LoginPageState loginPage) {

        Assert.assertEquals("Login", loginPage.getLoginPage().getPageHeader());
        Assert.assertEquals("OrangeHRM", loginPage.getLoginPage().getTitle());
        Assert.assertEquals("Username", loginPage.getLoginPage().getUserNameLabel());
        Assert.assertEquals("Password", loginPage.getLoginPage().getPasswordLabel());
    }

    public void assertTexBoxDisplay(LoginPageState loginPage) {
        Assert.assertEquals(true, loginPage.getLoginPage().getUserNameTextBox());
        Assert.assertEquals(true, loginPage.getLoginPage().getPasswordTextBox());
    }
}
