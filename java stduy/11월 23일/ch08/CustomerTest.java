package chapter03.ch08;

interface Sell {
 void sell();
}

interface Buy {
    void buy();
}

class Customer implements Sell, Buy {
    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    public void sayHello() {
        System.out.println("say Hello");
    }
}
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.buy();
        customer.sell();
        customer.sayHello();

        Buy buyer = customer;
        buyer.buy();
        Sell seller = customer;
        seller.sell();
    }
}
