package chapter03.ch05;

public class ManualCar extends car {
    @Override
    public void drive() {
        System.out.println("기어볼을 P->D");
        System.out.println("엑셀을 밟습니다.");
        System.out.println("핸들을 조향합니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밟습니다.");
        System.out.println("기어볼을 D->P");
        System.out.println("사이드 브레이크를 겁니다.");
    }
}