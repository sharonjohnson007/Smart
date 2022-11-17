package main.java;

public class Car extends Vehicle {

    private String type;
    String model;
    private String car;
    private int speed;
    private String color;
    private int numberOfGears;

    public Car(String type, String model, String car) {
        this.type = type;
        this.model = model;
        this.car = car;

    }

    Car(String type, String model) {

    }

    public int increaseSpeed(int increment) {
        this.speed = this.speed + increment;
        return this.speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void openDoors() {

    }
    @Override
    public void honk(){

        System.out.println("RAISE alerts");

    }


    public static void main(String[] args) {


        Car focus = new Car("Ford", "Focus", "red");
        Car auris = new Car("Toyota", "Auris", "blue");
        Car golf = new Car("Volkswagen", "Golf", "green");

        focus.increaseSpeed(10);
        auris.increaseSpeed(20);
        golf.increaseSpeed(30);
        System.out.println(focus.increaseSpeed(200));
        Vehicle vehicle=new Vehicle();
        vehicle.start();
    }
}










