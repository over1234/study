package chapter03.ch02;

public class CustomerTest {
    
    public static void main(String[] args)
    {
        Customer choi = new Customer("choi");
        VIPcustomer jung = new VIPcustomer("jung");

        choi.calcPrice(1000);
        jung.calcPrice(1000);

        choi.showInfo();
        jung.showInfo();
    }
}
