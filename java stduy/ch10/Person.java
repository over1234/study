package ch10;

public class Person {

    public Person(String name, int money) {
        this.money = money;
        this.name = name;
    }
    
    private String name;
    private int money;

    public void takeBus(Bus bus) {
        bus.take(200);
        money -= 200;
    }

    public void takeSubway(Subway subway) {
        subway.take(1300);
        money -= 1300;
    }

    public void takeCar(Car car, GasStation gasStation) {
        money -= car.take(gasStation);
        
    }

    public void showInfo() {
        System.out.println(name + "님의 남은 잔액은 " + money + "입니다.");
    }
}
