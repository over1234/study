package ch10;

public class Subway {
    public Subway(int number) {
        this.number = number;
    }
    
    public void  take(int money) {
        this.money += money;
        this.passCount++;
    }

    public void showInfo() {
        System.out.println(number + "번 지하철의 승객 수는" + passCount + "이고, 남은 돈은 " + money + "입니다.");
    }
    private int number;
    private int money;
    private int passCount;
}
