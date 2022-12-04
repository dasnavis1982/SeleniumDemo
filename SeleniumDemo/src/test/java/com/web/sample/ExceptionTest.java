package com.web.sample;

//import org.junit.Test;

import org.testng.annotations.Test;

public class ExceptionTest {


//    @Test(expected = ArithmeticException.class)
//    public void display() {
//        int num = 10;
//        int div = 0;
//        int val = num / div;
//        System.out.println(val);
//    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void print(){
        int num = 10;
        int div = 0;
        int val = num / div;
        System.out.println(val);
    }
}
