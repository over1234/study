package chapter03.ch02;

public class Customer {
    public Customer() {
    }
    public Customer(String name) {
        this.name = name;
        this.salesRatio = 0.0;
        this.bounsRatio = 0.01;
        this.grade = "Silver";
        this.ID = number++;
    }
    protected static int number = 100;
    protected int ID;
    protected String name;
    protected String grade;
    protected int bounsPoint;
    protected double bounsRatio;
    protected double salesRatio;

    public void calcPrice(int price) {
        bounsPoint += (int)(price * bounsPoint);
        System.out.println(price + "물건을 구매시 " + (price-(int)(price*salesRatio)) + "원을 지불합니다.");
        System.out.println(bounsPoint + "원 적립 됩니다.");
    }

    public void showInfo() {
        System.out.println("--------------------------------------고객 소개란---------------------------------------------");
        System.out.println("                                  고객 이름 : " + name);
        System.out.println("                                  고객 ID : " + ID);
        System.out.println("                                  고객 등급 : " + grade);
        System.out.println("                                  고객 적립급 : " + bounsPoint);
        System.out.println("                                  고객님의 할인률 : " + (int)(salesRatio * 100) + "%");
        System.out.println("                                  고객님의 적립급 이자률 : " + (int)(bounsRatio * 100) + "%");
        System.out.println("---------------------------------------------------------------------------------------------");
    }
}
