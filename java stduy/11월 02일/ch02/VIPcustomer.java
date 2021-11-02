package chapter03.ch02;

public class VIPcustomer extends Customer{

    public VIPcustomer(String name) {
        this.name = name;
        this.salesRatio = 0.1;
        this.bounsRatio = 0.05;
    }

    public void calcPrice(int price) {
        System.out.println(price + "물건을 구매시 " + (price - (int)(price * salesRatio)) + "원을 지불합니다.");
        System.out.println("적립은 " + (int)(price * bounsRatio) + "원 입니다.");
    }
    
}
