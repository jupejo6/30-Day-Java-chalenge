import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.lang.Exception;

class CalculatorTest {


    @org.junit.jupiter.api.Test
    void powerWithNegative() {

        Exception e = assertThrows(Exception.class, () ->Calculator.power(3, -3));

        String expectedMessage = "n and p should be non-negative";
        String actualMessage = e.getMessage();

        Assertions.assertEquals(expectedMessage,actualMessage);
    }

    @Test
    void powerWithBasicNumbers() throws Exception {
        Assertions.assertEquals(125,Calculator.power(5,3));
    }
    @Test
    void powerWithZero() throws Exception{
        Assertions.assertEquals(1,Calculator.power(5,0));
    }
}