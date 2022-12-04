package model.pages;

public class LoginPage {

    private String title;
    private String pageHeader;
    private String userNameLabel;
    private String passwordLabel;
    private boolean userNameTextBox;
    private boolean passwordTextBox;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPageHeader() {
        return pageHeader;
    }

    public void setPageHeader(String pageHeader) {
        this.pageHeader = pageHeader;
    }

    public String getUserNameLabel() {
        return userNameLabel;
    }

    public void setUserNameLabel(String userNameLabel) {
        this.userNameLabel = userNameLabel;
    }

    public String getPasswordLabel() {
        return passwordLabel;
    }

    public void setPasswordLabel(String passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public boolean getUserNameTextBox() {
        return userNameTextBox;
    }

    public void setUserNameTextBox(boolean userNameTextBox) {
        this.userNameTextBox = userNameTextBox;
    }

    public boolean getPasswordTextBox() {
        return passwordTextBox;
    }

    public void setPasswordTextBox(boolean passwordTextBox) {
        this.passwordTextBox = passwordTextBox;
    }
}
