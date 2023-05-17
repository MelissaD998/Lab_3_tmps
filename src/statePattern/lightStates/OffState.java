package statePattern.lightStates;

import statePattern.LightState;

public class OffState implements LightState {

    @Override
    public void turnOn() {
        System.out.println("Aprind lumina.");
    }

    @Override
    public void turnOff() {
        System.out.println("Lumina este deja stinsă.");
    }

    @Override
    public void brighten() {
        System.out.println("Nu pot mări luminozitatea când lumina este stinsă.");
    }

    @Override
    public void dim() {
        System.out.println("Nu pot reduce luminozitatea când lumina este stinsă.");
    }
}
