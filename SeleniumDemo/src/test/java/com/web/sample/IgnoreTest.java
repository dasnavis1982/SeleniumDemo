package com.web.sample;

import org.junit.Ignore;
//import org.junit.Test;
import org.testng.annotations.Test;

public class IgnoreTest {

//    @Ignore("Not ready to run")
//    @Test
//    public void divisionWith(){
//        System.out.println("Divisible by zero");
//    }

    @Test(enabled = false)
    public void divisionWith(){
        System.out.println("Divisible with zero");
    }

    @Test
    public void print(){
        System.out.println("Divisible with zero2");
    }

}
