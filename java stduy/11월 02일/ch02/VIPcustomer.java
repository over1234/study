package chapter03.ch02;

public class VIPcustomer extends Customer{

    public VIPcustomer(String name) {
        this.name = name;
        this.salesRatio = 0.1;
        this.bounsRatio = 0.05;
        this.grade = "Diamond";
        this.ID = number++;
    }

}
