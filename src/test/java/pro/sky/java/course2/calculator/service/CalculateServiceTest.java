package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculateServiceTest {


    private final CalculateService out = new CalculateServiceImpl();
    private int num1;
    private int num2;
    private int num3;
    private int num4;

    @BeforeEach
    public void setUp() {
        num1 = 4;
        num2 = 8;
        num3 = 16;
        num4 = 10;
    }


    @Test
    public void sum() {
        Assertions.assertEquals(out.getSum(num1, num2),
                num1 + num2);
        Assertions.assertEquals(out.getSum(num3, num4),
                num3 + num4);

    }

    @Test
    public void getDifference() {

        Assertions.assertEquals(out.getDifference(num1, num2),
                num1 - num2);
        Assertions.assertEquals(out.getDifference(num3, num4),
                num3 - num4);

    }

    @Test
    public void getMultiply() {
        Assertions.assertEquals(out.getMultiply(num1, num2),
                num1 * num2);
        Assertions.assertEquals(out.getMultiply(num3, num4),
                num3 * num4);

    }

    @Test
    public void getDivide() {
        Assertions.assertEquals(out.getDivide(num1, num2),
                (float) num1 / num2);

        Assertions.assertEquals(out.getDivide(num3, num4),
                (float)num3 / num4);

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> out.getDivide(num1, 0));

    }


}