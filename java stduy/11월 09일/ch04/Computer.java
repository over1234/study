package chapter03.ch04;

public abstract class Computer {
    protected abstract void display();

    protected abstract void typing();

    public void turnOn()
    {
        System.out.println("컴퓨터를 킵니다.");
    }

    public void turnOff()
    {
        System.out.println("컴퓨터를 끕니다.");
    }
}
