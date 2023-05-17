package statePattern;

import statePattern.lightStates.BrightState;
import statePattern.lightStates.DarkState;
import statePattern.lightStates.OffState;

public class Light {
    private LightState currentState;

    public Light() {
        currentState = new OffState();
    }

    public void setState(LightState state) {
        currentState = state;
    }

    public void turnOn() {
        currentState.turnOn();
        currentState = new BrightState(); // Actualizăm starea curentă la "Stare Luminoasă"
    }

    public void turnOff() {
        currentState.turnOff();
        currentState = new OffState(); // Actualizăm starea curentă la "Stare Oprită"
    }

    public void brighten() {
        currentState.brighten();
        currentState = new BrightState(); // Actualizăm starea curentă la "Stare Luminoasă"
    }

    public void dim() {
        currentState.dim();
        currentState = new DarkState(); // Actualizăm starea curentă la "Stare Întunecată"
    }
}
