package com.luxoft.jva;
import com.luxoft.jva.Methods;
import org.junit.Test;

import static com.luxoft.jva.Methods.sumOfLengths;
import static org.junit.Assert.*;

public class MethodsTest {

    @Test
    public void shouldReturn0WhenCalculatingLengthOfTwoEmptyStrings() {
        assertEquals(0, sumOfLengths("", ""));
    }

    @Test(expected = NullPointerException.class)
    public void throwsNullPointerExceptionNull() {
        sumOfLengths(null, "");
    }

}