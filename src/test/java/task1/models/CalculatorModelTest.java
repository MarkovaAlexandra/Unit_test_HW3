package task1.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorModelTest {
    private static CalculatorModel calculator;
    @BeforeAll
    public static void createCalculator(){
        calculator = new CalculatorModel();
    }
    @Test
    void getFirstNumber() {
        int expectedNum = 3;
        calculator.setFirstNumber(expectedNum);
        int actualNum = calculator.getFirstNumber();
        assertEquals(expectedNum, actualNum, "метод getFirstNumber некорректен");

    }

    @Test
    void getSecondNumber() {
        int expectedNum = 7;
        calculator.setSecondNumber(expectedNum);
        int actualNum = calculator.getSecondNumber();
        assertEquals(expectedNum, actualNum, "метод getSecondNumber некорректен");
    }

    @Test
    void setFirstNumber() {
        int expectedNum = 3;
        calculator.setFirstNumber(expectedNum);
        int actualNum = calculator.getFirstNumber();
        assertEquals(expectedNum, actualNum, "метод setFirstNumber некорректен");
    }

    @Test
    void setSecondNumber() {
        int expectedNum = 7;
        calculator.setSecondNumber(expectedNum);
        int actualNum = calculator.getSecondNumber();
        assertEquals(expectedNum, actualNum, "метод setSecondNumber некорректен");
    }

    @Test
    void add() {
        int expectedResult = 11;
        calculator.setFirstNumber(3);
        calculator.setSecondNumber(8);
        int actualResult = calculator.add();
        assertEquals(expectedResult, actualResult, "метод add некорректен");
    }

    @Test
    void substract() {
        int expectedResult = 4;
        calculator.setFirstNumber(9);
        calculator.setSecondNumber(5);
        int actualResult = calculator.substract();
        assertEquals(expectedResult, actualResult, "метод substract некорректен");
    }

    @Test
    void multiply() {
        int expectedResult = 72;
        calculator.setFirstNumber(8);
        calculator.setSecondNumber(9);
        int actualResult = calculator.multiply();
        assertEquals(expectedResult, actualResult, "метод multiply некорректен");
    }

    @Test
    void divide() {
        int expectedResult = 5;
        calculator.setFirstNumber(30);
        calculator.setSecondNumber(6);
        int actualResult = calculator.divide();
        assertEquals(expectedResult, actualResult, "метод divide некорректен");
    }

    @Test
    void divideByZero(){
        String message = "деление на ноль запрещено";
        calculator.setFirstNumber(30);
        calculator.setSecondNumber(0);
        Exception actualMessage = assertThrows(ArithmeticException.class, () -> calculator.divide());
        assertEquals(message, actualMessage.getMessage(), "метод divide некорректен");

    }
}