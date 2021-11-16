package chapter03.ch05;

public class CarTest {
    public static void main(String[] args) {
        car ai = new AIcar();
        car manual = new ManualCar();

        manual.run();
        ai.run();
    }
}
