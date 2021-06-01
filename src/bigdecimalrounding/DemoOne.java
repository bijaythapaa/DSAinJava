package bigdecimalrounding;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static org.junit.Assert.assertEquals;

public class DemoOne {

    @Test
    public void whenRoundingDecimal_thenExpectedResult() {
        BigDecimal bigDecimal = new BigDecimal("2.5");
        BigDecimal bigDecimalRounded = bigDecimal.round(new MathContext(1, RoundingMode.HALF_EVEN));

        assertEquals("2", bigDecimalRounded.toString());
    }
}
