package HW3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckNumbersTest {
    CheckNumbers checkNumbers = new CheckNumbers();

    /*
    тест для проверки правильности определения четных и нечетных чисел
     */
    @Test
    void evenOddNumber() {
        int oddtestValue = 4; // тестовое четное значение
        int notOddTestValue = 5; // тестовое нечетное значение
        boolean actualOdd = checkNumbers.evenOddNumber(oddtestValue); // получаемое значение из вызываемого метода
        assertTrue(actualOdd,"Четные не верно"); // ожидаем, что оно true
        boolean actualNotOdd = checkNumbers.evenOddNumber(notOddTestValue); // получаемое значение из вызываемого метода
        assertFalse(actualNotOdd," нечетные не верно"); // ожидаем, что оно false

    }
    /*
    метод тестирует правильность проверки интервала (25, 100)
     */
    @Test
    void numberInInterval() {
        int intervalTestValue = 70; // значение в интервале
        int notIntervalValue = 200; // значение вне интервала
        // дальше не вводила отдельные переменные для сохранения значений, получаемых из метода, сразу в ассерте вызывала
        // можно сделать и как в предыдущем методе
        assertTrue(checkNumbers.numberInInterval(intervalTestValue),"ошибка для значения в интервале");
        assertFalse(checkNumbers.numberInInterval(notIntervalValue),"ошибка для значения не в интервале");
    }
}