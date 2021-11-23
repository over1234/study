package chapter04.ch01;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addElements("A");
        list.addElements("B");
        list.addElements("C");

        list.insertElement(1, "D");

        list.printAll();
    }
}
