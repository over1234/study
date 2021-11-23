package chapter04.ch01;

public class MyListNode {
    private String data;
    public MyListNode next;


    public MyListNode() {
        this.data = null;
        this.next = null;
    }

    public MyListNode(String data) {
        this.data = data;
        this.next = null;

    }

    public MyListNode(String data, MyListNode next) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return data;
    }
}
