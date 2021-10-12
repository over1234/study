package ch10;

public class Car {
    public Car(String name) {
        this.name = name;
    }

    public int take(GasStation gasStation) {
        return gasStation.oiling(3);
    }
    private String name;
}
