package ch10;

public class TakeTest {

    static public void main(String[] args)
    {
        Person p1 = new Person("yesterdayMrchoi", 5000);
        Person p2 = new Person("todayMrchoi", 20000);

        Subway brown = new Subway(3);
        Bus bus7_2 = new Bus("7-2");
        Car mycar = new Car("myCar");
        GasStation suyeong = new GasStation("suyeong");
       
        p1.takeSubway(brown);
        p1.takeBus(bus7_2);

        
        System.out.println("------------------------------------------------yesterdayMrchoi--------------------------------------------------------");
        p1.showInfo();

        brown.showInfo();
        bus7_2.showInfo();

        System.out.println("================================================================================================================================================================");
       
        p2.takeCar(mycar, suyeong);
       
        System.out.println("----------------------------------------------------------todayMrchoi------------------------------------------------------------------");
        
        p2.showInfo();

        suyeong.showInfo();
        
        
    }
}
