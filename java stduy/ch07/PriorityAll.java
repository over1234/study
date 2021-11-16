package chapter03.ch07;

public class PriorityAll implements Schedular{
    @Override
    public void getNextCall() {
        System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 스킬이 높은 상담원에게 우선적으로 배정합니다.");
    }

}
