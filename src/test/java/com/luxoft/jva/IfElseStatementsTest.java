package com.luxoft.jva;

import org.junit.Test;

import static org.junit.Assert.*;

public class IfElseStatementsTest {

    @Test
    public void testSum() {
        IfElseStatements.sum(1,2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failIfSummingNegative() {
        IfElseStatements.sum(-1,1);
    }
}