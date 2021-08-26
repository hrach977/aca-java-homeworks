package homeworks.artur.danielyan.oop;

public class Person {
    private boolean gender; //true is male
    private double height;
    private int age;
    private String name;

//    private Home;
    private IVehicle vehicle;

    public Person(boolean gender, double height, int age, String name){
        this.gender = gender;
        this.height = height;
        this.age = age;
        this.name = name;
    }

//    // getters

    public IVehicle getVehicle(){
        return vehicle;
    }

//    public boolean getGender() {
//        return gender;
//    }
//
//    public double getHeight(){
//        return height;
//    }
//
//    public int getAge(){
//        return age;
//    }
//
//    public String getName(){
//        return name;
//    }

    // setters
//    public void setGender(boolean gender){
//        this.gender = gender;
//    }
//
//    public void setHeight(double height){
//        this.height = setter;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    // setters end
    public void setIVehicle(IVehicle vehicle){
        this.vehicle = vehicle;
    }
}
