package com.web.sample;

import org.junit.Test;

public class TimeTest {


    @Test(timeout = 3000)
    public void display(){
        while (true);
    }

    @Test
    public void print(){
        System.out.println("hello world");
    }
}
