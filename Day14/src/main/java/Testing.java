package main.java;
import org.junit.*;

import static org.junit.Assert.*;


public class Testing {
    @BeforeClass
    public static void add(){
        System.out.println("Runs first");
    }
    @AfterClass
    public static void add1(){
        System.out.println("runs last");
    }
    @Before
    public void add3(){
        System.out.println("before test method");
    }
    @After
    public void sub(){
        System.out.println("After test method");
    }
    @Test
    public void add2(){
        System.out.println("method testing");
    }
    @Test
    public void add4(){
        System.out.println("metho testing1");
    }
    @Ignore

    public void add5(){
        System.out.println("before class testing");
    }



}
