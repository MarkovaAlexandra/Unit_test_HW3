package task1.models;

public class CalculatorModel {
    private int firstNumber;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int add() {
        return firstNumber + secondNumber;
    }

    public int substract() {
        return firstNumber - secondNumber;
    }

    public int multiply() {
        return firstNumber * secondNumber;
    }

    public int divide() {
        if(secondNumber == 0){
            throw new ArithmeticException("деление на ноль запрещено");
        }
        else {
            return firstNumber / secondNumber;
        }
    }
}

