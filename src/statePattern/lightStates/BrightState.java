package statePattern.lightStates;


import statePattern.LightState;

public class BrightState implements LightState {
    @Override
    public void turnOn() {
        System.out.println("Lumina este deja aprinsă și este luminoasă.");
    }

    @Override
    public void turnOff() {
        System.out.println("Sting lumina.");
    }

    @Override
    public void brighten() {
        System.out.println("Lumina este deja luminoasă.");
    }

    @Override
    public void dim() {
        System.out.println("Reduc luminozitatea.");
    }
}
