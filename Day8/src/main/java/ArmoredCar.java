package main.java;

public class ArmoredCar extends Car{

    private boolean bulletProofWindows;
    public ArmoredCar(String type, String model, String car, boolean bulletProofWindows) {
        super(type, model, car);
        this.bulletProofWindows = bulletProofWindows;
    }




    public void remoteStartCar() {
        System.out.println("NO NEED KEYS");

    }
    public String registerModel() {
        return model;
    }
}
