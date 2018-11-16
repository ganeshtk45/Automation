package org.testNg;


import org.testng.annotations.*;

/**
 * Created by ganesh on 16-11-2018.
 */
public class testing
{
  @Test
    public void method1()
   {
       System.out.println("amethod1");
   }
   @BeforeClass
    public void beforeClass()
   {
       System.out.println("before class");
   }
   @AfterClass
    public void afterClass()
   {
       System.out.println("after class");
   }
   @BeforeSuite
    public void beforeSuite()
   {
       System.out.println("Before suite");
   }
   @AfterSuite
    public void afterSuite()
   {
       System.out.println("After Suite");
   }
   @BeforeTest
    public void beforetest()
   {
       System.out.println("before test");
   }
   @AfterTest
    public void afterTest()
   {
       System.out.println("after test");
   }
   @BeforeMethod
    public void beforeMethod()
   {
       System.out.println("before method");
   }
   @AfterMethod
   public void aftermethod()
   {
       System.out.println("After method");
   }
}
