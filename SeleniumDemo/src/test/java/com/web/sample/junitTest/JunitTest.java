package com.web.sample.junitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Test1.class,
        Test2.class,
        Test3.class
//        Test3BeforeClass.class
})
public class JunitTest {

}