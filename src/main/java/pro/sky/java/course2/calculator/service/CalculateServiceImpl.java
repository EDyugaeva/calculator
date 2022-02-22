package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {
    private int result;


    @Override
    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int getDifference(int num1, int num2) {
        return num1-num2;
    }

    @Override
    public int getMultiply(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public float getDivide(int num1, int num2) {
            return (float) num1 / num2;
    }

}
