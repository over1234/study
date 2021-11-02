package chapter03.ch01;

public class Mammalia {
    protected String name;
    protected String address;

    public void walk(String leg) {
        System.out.println(name + "은 " + leg + "로 걷고 있습니다.");
    }

    public void showInfo() {
        System.out.println("이름은 " + name + "이고, 사는 곳은 " + address + "입니다.");
    }
}
