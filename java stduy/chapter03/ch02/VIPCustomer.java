package chapter03.ch02;

public class VIPCustomer extends Customer {
    private double saleRatio;
    public VIPCustomer(String name) {
        super(name);
        super.name = name;
        super.grade = "Diamond";
        super.bounsRatio = 0.05;
        super.customerID = number++;
        this.saleRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bounsRatio;
        return price - (int)(price * saleRatio);
    }
}
