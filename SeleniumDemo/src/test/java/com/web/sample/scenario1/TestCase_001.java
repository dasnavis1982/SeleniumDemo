package com.web.sample.scenario1;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_001 {

    private WebDriver webDriver;

    @BeforeClass
    public void setupTheDriver() {
        System.setProperty("Webdriver.chrome.driver", "/User/navisalfredjeromefrancisantonyraj/Downloads/chromedriver");
        webDriver = new ChromeDriver();
    }

    @Before
    public void lunchTheBrowser() throws InterruptedException {
        webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
    }

    @Test
    public void checkTheTitle() throws InterruptedException {
        String title = webDriver.getTitle();
        Assert.assertEquals("",title);
        webDriver.findElement(By.xpath("//div/input[@name='username']")).sendKeys("Admin");
    }

    @After
    public void close() {
        webDriver.close();
    }

}
