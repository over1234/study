package chapter03.ch01;

public class AnimalTest {

    public static void main(String[] args) {

        Person choi = new Person("choi", "gangseogu");
        Tiger bat = new Tiger("bat", "gangseogu");

        choi.walk("2발");
        choi.showInfo();
        choi.drive();
        
        bat.walk("4발");
        bat.showInfo();
        bat.hunt();
    }
    
}
