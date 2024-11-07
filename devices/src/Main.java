interface Device{
    void turnOn();
    void turnOff();
    default void charge() {
        System.out.println("device charged");
    }
    static void reset(){
        System.out.println("device reset");
    }
}
class Smartphone implements Device{
     public void turnOn(){
        System.out.println("device turned on");
    }
    public void turnOff(){
        System.out.println("device turned off");
    }

}
class Laptop implements Device{
    public void turnOn() {
        System.out.println("device turned on");
    }
    public void turnOff() {
        System.out.println("device turned off");
    }
}
public class Main {
    public static void main(String[] args) {
    Smartphone smartphone = new Smartphone();
        System.out.println("smartphone:");
    smartphone.turnOn();
    smartphone.turnOff();
    smartphone.charge();
    Device.reset();
    Laptop laptop = new Laptop();
    System.out.println("laptop:");
    laptop.turnOn();
    laptop.turnOff();
    laptop.charge();
    Device.reset();
    }
}