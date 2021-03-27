package com.reena.nextChar;

import org.junit.Assert;
import org.junit.Test;

public class NextCharTest {

    @Test
    public void testNextCharForzZ(){
        String input = "123 zzZZ *3";
        String expected = "123 aaAA *3";
        Assert.assertTrue("Pass", Main.nextChar(input).equals(expected));
    }

    @Test
    public void testNextCharForNumbersCharsWithLowerCase(){
        String input = "123 abcd *3";
        String expected = "123 bcde *3";
        Assert.assertTrue("Pass", Main.nextChar(input).equals(expected));
    }

    @Test
    public void testNextCharForNumbersCharsWithLowerCaseAndUpperCase(){
        String input = "**Casa 52";
        String expected = "**Dbtb 52";
        Assert.assertTrue("Pass", Main.nextChar(input).equals(expected));
    }


    @Test
    public void testNextCharForStars(){
        String input = "**********";
        String expected = "**********";
        Assert.assertTrue("Pass", Main.nextChar(input).equals(expected));
    }

    @Test
    public void testNextCharForNumbers(){
        String input = "123456789";
        String expected = "123456789";
        Assert.assertTrue("Pass", Main.nextChar(input).equals(expected));
    }

    @Test
    public void testNextCharForEmptyString(){
        String input = "";
        String expected = "";
        Assert.assertTrue("Pass", Main.nextChar(input).equals(expected));
    }

    @Test(expected = NullPointerException.class)
    public void testNextCharForNull(){
        String input = null;
        String expected = null;
        Assert.assertTrue("Should throw NullPointerException", Main.nextChar(input).equals(expected));
    }


}
