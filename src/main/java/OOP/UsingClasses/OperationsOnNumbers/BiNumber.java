package OOP.UsingClasses.OperationsOnNumbers;

public class BiNumber {
    private int number1;
    private int number2;

    BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    int getNumber1() {return number1;}
    int getNumber2() {return number2;}

    public void setNumber1(int number1) {this.number1 = number1;}
    public void setNumber2(int number2) {this.number2 = number2;}

    void doubleNumbers() {
        number1 *= 2;
        number2 *= 2;
    }

    int add() {
        return number1 + number2;
    }

    int multiply() {
        return number1 * number2;
    }
}