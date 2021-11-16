package chapter03.ch05;

public abstract class car {
    
    public void startCar() {
        System.out.println("브레이크를 밟습니다.");
        System.out.println("시동을 겁니다.");
    }
    public void trunOff() {
        System.out.println("브레이크를 밟습니다.");
        System.out.println("시동이 꺼집니다.");
    }
    public abstract void drive();
    
    public abstract void stop();

    public void run() {
        startCar();
        drive();
        stop();
        trunOff();
    }
}
