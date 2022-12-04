package com.web.sample.testngTest;

import org.testng.annotations.*;

public class DifferentAnnotationTestNG {

    @Test
    public void test() {
        System.out.println("From testMethod");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("From beforeSuite");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("From beforeClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("From beforeMethod");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("From beforeTest");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("From afterSuite");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("From afterClass");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("From afterMethod");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("From afterTest");
    }
}
