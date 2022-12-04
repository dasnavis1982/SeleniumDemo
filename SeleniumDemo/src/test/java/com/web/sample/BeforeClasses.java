package com.web.sample;

import org.junit.Test;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BeforeClasses {


    private WebDriver driver;
    private static Properties properties;
    private static FileInputStream fileInputStream;
    private WebElement webElement;

    @BeforeClass
    public static void preCondition() throws IOException {
        properties = new Properties();
        fileInputStream = new FileInputStream("src/test/java/application.properties");
        properties.load(fileInputStream);
    }

    @Test
    public void launch(){
        System.setProperty("Webdriver.chrome.driver", properties.getProperty("driverPath"));
        driver = new ChromeDriver();
        driver.get(properties.getProperty("url"));
    }
}
