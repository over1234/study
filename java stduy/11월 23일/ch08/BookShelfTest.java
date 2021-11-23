package chapter03.ch08;

public class BookShelfTest {
    public static void main(String[] args) {
        Queue queue = new BookShelf();

        queue.enQueue("삼국지 1");
        queue.enQueue("삼국지 2");
        queue.enQueue("삼국지 3");
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        queue.getSize();
    }
}
