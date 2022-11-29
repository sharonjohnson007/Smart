package main.java;

import main.java.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCalculator {

    @Test
    void nullTest(){
        StringCalculator stringCalculator=new StringCalculator();
        int actual = stringCalculator.calculator("");
        assertEquals(0,actual);
    }
    @Test
    void singleNumber(){
        StringCalculator stringCalculator=new StringCalculator();
        int actual=stringCalculator.calculator("1");
        assertEquals(1,actual);
    }
    @Test
    void twoNumber(){
        StringCalculator stringCalculator=new StringCalculator();
        int actual=stringCalculator.calculator("1,2");
        assertEquals(3,actual);

    }
    @Test
    void nNumbers(){
        StringCalculator stringCalculator=new StringCalculator();
        int actual=stringCalculator.calculator("1,2,4,5");
        assertEquals(12,actual);
    }
    @Test
    void newLineInsteadCommas(){
        StringCalculator stringCalculator=new StringCalculator();
        int actual=stringCalculator.calculator("1\n");
        assertEquals(1,actual);

    }
   /* @Test
    void delimiter(){

        StringCalculator stringCalculator=new StringCalculator();
        int actual=stringCalculator.calculator("//;1\n2;3;4");
        assertEquals(10,actual);
    }*/


}