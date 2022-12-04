package com.web.sample.junitTest;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3BeforeClass {

    public WebDriver driver;

    @Before
    public void execute() {
        System.setProperty("Webdriver.chrome.driver", "/User/navisalfredjeromefrancisantonyraj/Downloads/chromedriver");
        System.out.println("Hello");
        driver = new ChromeDriver();

        driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-admin/install.php");
    }

    @Test
    public void launch() {
        try {
            driver.findElement(By.name("weblog_title")).isDisplayed();
        } catch (NoSuchElementException ex) {
            ex.getMessage();
        }
        try {
            driver.findElement(By.name("user_name")).isDisplayed();
        } catch (NoSuchElementException ex) {
            ex.getMessage();
        }
    }

    @Test//test cases1
    public void sendKeysTitle() {
        driver.findElement(By.name("weblog_title")).sendKeys("Mr");
        driver.findElement(By.name("user_name")).sendKeys("Alfred");
        driver.findElement(By.name("pasword")).clear();
        driver.findElement(By.name("pasword")).clear();
    }

    @Test//test cases2
    public void sendKeysUserName() {
        driver.findElement(By.name("user_name")).sendKeys("Alfred");
    }

    @After
    public void clearFields() {
        driver.findElement(By.name("weblog_title")).clear();
    }

//    @AfterClass
//    public  void closeApp() {
//        driver.close();
//    }
}
