package calculator;

public class Calculator {

    int first;
    int second;
    int result;

    public void insertFirst(int first) {
        this.first = first;
    }

    public void insertSecond(int second) {
        this.second = second;
    }

    public void add() {
        result = first + second;
    }

    public int getResult() {
        return result;
    }
}
