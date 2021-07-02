package com.softserve.edu.hw12;

import org.junit.Assert;
import org.junit.Test;


public class BracketsVerificationTest {


    @Test
    public void testTrueRoundBrackets() {
        Assert.assertEquals(true, BracketsVerification.verifyBrackets("(sometext)"));
    }

    @Test
    public void testTrueSquareBrackets() {
        Assert.assertEquals(true, BracketsVerification.verifyBrackets("[sometext]"));
    }

    @Test
    public void testFalseCurlyBrackets() {
        Assert.assertEquals(false, BracketsVerification.verifyBrackets("}sometext{"));
    }

    @Test
    public void testFalseSquareBrackets() {
        Assert.assertEquals(false, BracketsVerification.verifyBrackets("[sometext}"));
    }
}