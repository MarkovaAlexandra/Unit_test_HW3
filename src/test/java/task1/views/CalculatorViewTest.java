package task1.views;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorViewTest {
    private static CalculatorView view;
    @BeforeAll
    public static void setUp(){
        view = new CalculatorView();
    }

    @Test
    void printMenu() {
        // Проверяем, что метод printMenu() выводит текст меню
        // Создаем объект ByteArrayOutputStream, чтобы перехватить вывод
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        view.printMenu();
        // Проверяем, что вывод соответствует ожидаемому тексту
        assertEquals("Выберите операцию:\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Деление\n5. Выход\n",outContent.toString(),"некорректный метод printMenu");

        // Восстанавливаем стандартный поток вывода данных
        System.setOut(System.out);
    }

    @Test
    void printResult() {
        // Прверяем, что метод printResult() выводит результат
        // Создаем объект ByteArrayOutputStream, чтобы перехватить вывод
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        view.printResult(10);
        // Проверяем, что вывод соответствует ожидаемому тексту
        assertEquals("Результат: " + 10 + "неверный формат",outContent.toString(),"некорректный метод printMenu");

        // Восстанавливаем стандартный поток вывода данных
        System.setOut(System.out);

    }

    @Test
    void getInput() {
        int expectedValue = 9;
        String testedValue = "9";
        ByteArrayInputStream inContent = new ByteArrayInputStream(testedValue.getBytes());
        InputStream inputstream = System.in;//сохраняем ссылку на ввод с клавиатуры
        System.setIn(inContent);// подменяем ввод
        int actualValue = view.getInput();//вызываем метод
        System.setIn(inputstream);//Возвращаем обратно
        assertEquals(expectedValue, actualValue,"некорректный метод getInput");
    }

    @Test
    void printErrorMessage() {
        // Проверяем, что метод printErrorMessage() выводит текст ошибки
        // Создаем объект ByteArrayOutputStream, чтобы перехватить вывод
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        view.printErrorMessage("деление на ноль запрещено");
        // Проверяем, что вывод соответствует ожидаемому тексту

        String expected = "деление на ноль запрещено\r\n";
        assertEquals(expected,outContent.toString(),"некорректный метод printErrorMessage");

        // Восстанавливаем стандартный поток вывода данных
        System.setOut(System.out);
    }
}