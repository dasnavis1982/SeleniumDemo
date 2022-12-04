import org.checkerframework.checker.units.qual.C;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenarios {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("Webdriver.chrome.driver", "/User/navisalfredjeromefrancisantonyraj/Downloads/chromedriver");
        driver = new ChromeDriver();
        System.out.println("BeforeClass Test case");
    }

    @Before
    public void launch() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        System.out.println("Before Test Case");
    }

    @Ignore("Bug-4567")
    @Test
    public void verifyTheHeader() {
        String headerText = driver.findElement(By.xpath("//h5[text()='Login']")).getText();
        Assert.assertEquals("Login", headerText);
        System.out.println("Test Case1");
    }

    @Test
    public void verifyTheLabels() {
        boolean userNameTextBox = driver.findElement(By.xpath("//label[text()='Username']")).isDisplayed();
        boolean passwordTextBox = driver.findElement(By.xpath("//label[text()='Password']")).isDisplayed();
        Assert.assertEquals(true, userNameTextBox);
        Assert.assertEquals(true, passwordTextBox);
        System.out.println("Test Case2");
    }

    @AfterClass
    public static void closeApplication() {
        driver.close();
        System.out.println("After Test Case");
    }
}
