package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println ("BeforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println ("AfterSuite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println ("BeforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println ("AfterTest");
    }
}
