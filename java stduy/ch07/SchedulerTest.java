package chapter03.ch07;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 할당 방식을 선택하세요!");
        System.out.println("R : 한명씩 차례대로 할당");
        System.out.println("S : 쉬고있거나 대기가 가장 적은 상담원에게 할당");
        System.out.println("P : VIP 전용");

        int ch = System.in.read();
        Schedular scheduler = null;

        if(ch == 'r' || ch == 'R') {
            scheduler = new RoundRobin();
        }

        else if (ch == 's' || ch == 'S') {
            scheduler = new ShortestJob();
        }

        else if (ch == 'p' || ch == 'P') {
            scheduler = new PriorityAll();
        }
        else {
            System.out.println("아무것도 할당되지 않았습니다.");
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
