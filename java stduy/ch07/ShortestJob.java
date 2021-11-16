package chapter03.ch07;

public class ShortestJob implements Schedular{
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("쉬고있는 상담원 또는 대기가 가장 적은 상담원에게 배정합니다.");
    }
    
}
