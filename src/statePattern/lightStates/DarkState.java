package statePattern.lightStates;

import statePattern.LightState;
public class DarkState implements LightState {
    @Override
    public void turnOn() {
        System.out.println("Aprind lumina întunecată.");
    }

    @Override
    public void turnOff() {
        System.out.println("Sting lumina.");
    }

    @Override
    public void brighten() {
        System.out.println("Măresc luminozitatea.");
    }

    @Override
    public void dim() {
        System.out.println("Lumina este deja întunecată.");
    }
}
