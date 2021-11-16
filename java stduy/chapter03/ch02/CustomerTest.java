package chapter03.ch02;

public class CustomerTest {

     public static void main(String[] args) {
        Customer mrchoi = new Customer("mrchoi");
        VIPCustomer jung = new VIPCustomer("정현우");

        mrchoi.showInfo();
        jung.showInfo();

    }
    
}
