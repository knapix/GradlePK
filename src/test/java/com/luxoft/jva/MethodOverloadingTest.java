package com.luxoft.jva;

import org.junit.Assert;
import org.junit.Test;

import static com.luxoft.jva.MethodOverloading.sum;
import static org.junit.Assert.*;

public class MethodOverloadingTest {

    @Test
    public void ShouldCheckOverloadingMethod() {
        Assert.assertEquals(6, sum(1,2,3));
    }
}