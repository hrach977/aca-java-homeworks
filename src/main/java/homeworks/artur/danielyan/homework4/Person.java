package homeworks.artur.danielyan.homework4;

public class Person {
    String name;
    int height;
    Home home;
    Vehicle vehicle;
    //Phone phone;

    void move(int speed){
        if(speed >= 8){
            System.out.println("Someone is running on the speed " + speed + " km/h");
        }else {
            System.out.println("Someone is walking on the speed " + speed + " km/h");
        }
    }
}
