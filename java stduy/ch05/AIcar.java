package chapter03.ch05;

public class AIcar extends car{
    @Override
    public void drive() {
        System.out.println("자율주행 합니다.");
        System.out.println("자동차가 스스로 방향을 바꿉니다.");
    }

    @Override
    public void stop() {
        System.out.println("자율적으로 멈춥니다.");
    }
}
