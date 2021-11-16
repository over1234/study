package chapter03.ch02;

public class Customer {

    protected static int number = 1000;
    protected String name;
    protected int customerID;
    protected String grade;
    protected int bonusPoint;
    protected double bounsRatio;
    public Customer(String name) {
        this.name = name;
        this.customerID = number++;
        this.grade = "Silver";
        this.bounsRatio = 0.01;
        this.bonusPoint += calcPrice(1000) * bounsRatio;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bounsRatio;
        return price;
    }

    public void showInfo() {
        System.out.println("--------------------------------------------사용자 정보-----------------------------------------------------------");
        System.out.println("                                    고객님의 이름 : " + name);
        System.out.println("                                    고객님의 ID : " + customerID);
        System.out.println("                                    고객님의 등급 : " + grade);
        System.out.println("                                    고객 적립급 : " + bonusPoint + "원");
        System.out.println("                                    고객님의 적립급 이자률 : " + bounsRatio * 100 + "%");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
    }
    
}
