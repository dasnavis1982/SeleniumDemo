package com.web.sample.junitTest;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test1 {

    @Before
    public void launch() {
        System.out.println("From the before");
    }

    @Test()
    public void first() {
        System.out.println("From Test1");
    }

    @Test()
    public void second() {
        System.out.println("From Test2");
    }

    @Test()
    public void third() {
        System.out.println("From Test3");
    }

    @After
    public void close() {
        System.out.println("From the after");
    }
}

//>> @Before @Test @After @Before @Test @After