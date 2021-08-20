package homeworks.artur.danielyan.homework4;

public class Car extends Vehicle{

    void drive(int speed){
        if(direction){
            System.out.println("Some vehicle is driving forward on the speed " + speed + " km/h");
        }else{
            System.out.println("Some vehicle is driving backward on the speed " + speed + " km/h");
        }
    }
}
