import org.assertj.core.api.Assertions;
import org.assertj.core.data.Percentage;
import org.junit.Assert;
import org.junit.Test;

public class MathTest {
    @Test
    public void shouldReturnVersionGreaterThan6() {
    //Assertions.assertThat(5*5).isEqualTo(25);
    //Assertions.assertThat(5*5).isGreaterThan(26);
    //Assertions.assertThat(5/2).isCloseTo(2, Percentage.withPercentage(2));
        //Assert.assertEquals(12, 2*6);
        //Assert.assertTrue(23 > 10);
        //Assert.assertTrue("5*5 was greater than 26", 5*5 > 26);

        /*
        ssertions.assertThat(cstrTradeVersion())
                .as("Trade version was less or equal than 6")
                .isGreaterThan(6);
                */
        Assert.assertTrue(cstrTradeVersion() > 6);

    }
    private int cstrTradeVersion() {
        return 7;
    }
}
