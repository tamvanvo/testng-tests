package com.google.tests;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by duongnapham on 4/22/15.
 */
public class WelcomeMessageTest {

    @BeforeClass
    public void testBeforeClass(){
        System.out.println("----------------------------------------");
        System.out.println("--- Run class - WelcomeMessageTest -------");
        System.out.println("------------------------------------------");
    }

    @AfterClass
    public void testAfterClass(){
        System.out.println("------------------------------------------");
        System.out.println("---- END OF CLASS : WelcomeMessageTest------");
        System.out.println("-------------------------------------------");
    }

    @Test(groups = {"p1", "testWelcomeMessagePage_001"})
    public void testWelcomeMessagePage_001(){
        System.out.println("------------------------------------------");
        System.out.println("----testWelcomeMessagePage_001 -----------");
        System.out.println("------------------------------------------");
        System.out.println("+++ Message from METHOD: testWelcomeMessagePage_001 +++");
        Assert.assertEquals(true, true);
        System.out.println("----------------------------------------------");
        System.out.println("--- END OF TEST - testWelcomeMessagePage_001 ---");
        System.out.println("-------------------------------------------------");
    }

    @Test(groups = {"p2", "testWelcomeMessagePage_002"})
    public void testWelcomeMessagePage_002(){
        System.out.println("------------------------------------------");
        System.out.println("----testWelcomeMessagePage_002 -----------");
        System.out.println("------------------------------------------");
        System.out.println("+++ Message from METHOD: testWelcomeMessagePage_002 +++");
        Assert.assertEquals(true, false);
        System.out.println("----------------------------------------------");
        System.out.println("--- END OF TEST - testWelcomeMessagePage_002 ---");
        System.out.println("-------------------------------------------------");
    }

    @Test(groups = {"p1", "testWelcomeMessagePage_003"})
    public void testWelcomeMessagePage_003(){
        System.out.println("------------------------------------------");
        System.out.println("----testWelcomeMessagePage_003 -----------");
        System.out.println("------------------------------------------");
        System.out.println("+++ Message from METHOD: testWelcomeMessagePage_003 +++");
        System.out.println("----------------------------------------------");
        System.out.println("--- END OF TEST - testWelcomeMessagePage_003 ---");
        System.out.println("-------------------------------------------------");
    }
}
