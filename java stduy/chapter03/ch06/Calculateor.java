package chapter03.ch06;

public abstract class Calculateor implements Calc{
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }
}
