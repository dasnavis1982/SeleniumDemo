package state;

import model.pages.LoginPage;

public class LoginPageState {

    private LoginPage loginPage = new LoginPage();

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(LoginPage loginPage) {
        this.loginPage = loginPage;
    }
}
