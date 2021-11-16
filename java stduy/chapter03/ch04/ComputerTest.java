package chapter03.ch04;

public class ComputerTest {
    public static void main(String[] args) {
        Computer desktop = new Desktop();
        Computer notebook = new MyNotebook();

        desktop.display();
        desktop.typing();

        notebook.display();
        notebook.typing();
        notebook.turnOff();
    }
}
