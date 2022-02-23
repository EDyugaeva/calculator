package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculateServiceParameterizedTest {

    private final CalculateService out = new CalculateServiceImpl();

    public static Stream<Arguments> provideParamsForGetSumTest() {
        return Stream.of(
                Arguments.of(1,1,2),
                Arguments.of(2,2,4)
        );

    }

    public static Stream<Arguments> provideParamsForGetMultiplyTest() {
        return Stream.of(
                Arguments.of(1,1,1),
                Arguments.of(3,3,9)
        );

    }
    public static Stream<Arguments> provideParamsForGetDifferenceTest() {
        return Stream.of(
                Arguments.of(1,1,0),
                Arguments.of(5,2,3)
        );

    }
    public static Stream<Arguments> provideParamsForGetDivideTest() {
        return Stream.of(
                Arguments.of(1,1,1),
                Arguments.of(5,2,2.5f)
        );

    }

    @ParameterizedTest
    @MethodSource("provideParamsForGetSumTest")
    public void testSum(int num1, int num2, int expected) {
        int result = out.getSum(num1,num2);
        Assertions.assertEquals(expected, result);

    }

    @ParameterizedTest
    @MethodSource("provideParamsForGetDifferenceTest")
    public void testDifference(int num1, int num2, int expected) {
        int result = out.getDifference(num1,num2);
        Assertions.assertEquals(expected, result);

    }

    @ParameterizedTest
    @MethodSource("provideParamsForGetMultiplyTest")
    public void testMultiply(int num1, int num2, int expected) {
        int result = out.getMultiply(num1,num2);
        Assertions.assertEquals(expected, result);

    }

    @ParameterizedTest
    @MethodSource("provideParamsForGetDivideTest")
    public void testDivide(int num1, int num2, float expected) {
        float result = out.getDivide(num1,num2);
        Assertions.assertEquals(expected, result);

    }


}
