package testCases;

import assertion.PageAssertions;
import model.pages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import state.LoginPageState;

public class Scenario_001 {

    private static WebDriver webDriver;
    private LoginPage loginPage = new LoginPage();
    private LoginPageState loginPageState = new LoginPageState();
    private PageAssertions pageAssertions = new PageAssertions();

    @BeforeClass
    public static void setupDriver() throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/User/navisalfredjeromefrancisantonyraj/Downloads/chromedriver");
        webDriver = new ChromeDriver();
        Thread.sleep(5000);
    }

    @Before
    public void beforeTestCase() {
        System.out.println("Before Test Case");
        webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test()
    public void verifyLabels() {

        loginPage.setPageHeader(webDriver.findElement(By.xpath("//h5[text()='Login']")).getText());
        loginPage.setTitle(webDriver.getTitle());
        loginPage.setUserNameLabel(webDriver.findElement(By.xpath("//label[text()='Username']")).getText());
        loginPage.setPasswordLabel(webDriver.findElement(By.xpath("//label[text()='Password']")).getText());
        loginPageState.setLoginPage(loginPage);
        pageAssertions.assertLoginPageLabels(loginPageState);
    }

    @Test
    public void verifyTextBox() throws InterruptedException {

        loginPage.setUserNameTextBox(webDriver.findElement(By.xpath("//label[text()='Username']")).isDisplayed());
        loginPage.setPasswordTextBox(webDriver.findElement(By.xpath("//label[text()='Password']")).isDisplayed());
        loginPageState.setLoginPage(loginPage);
        pageAssertions.assertTexBoxDisplay(loginPageState);
    }

    @After
    public void close() {
        System.out.println("After Test cases");
        webDriver.close();
    }
}
