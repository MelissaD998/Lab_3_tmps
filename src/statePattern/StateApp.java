package statePattern;

import statePattern.lightStates.DarkState;

public class StateApp {
    public static void main(String[] args) {
        Light light = new Light();

        light.turnOn(); // Aprindem lumina
        light.brighten(); // Mărim luminozitatea
        light.dim(); // Reducem luminozitatea
        light.turnOff(); // Stingem lumina

        // Schimbăm starea la "Stare Întunecată"
        light.setState(new DarkState());

        light.turnOn(); // Aprindem lumina
        light.dim(); // Lumina este deja întunecată
        light.brighten(); // Mărim luminozitatea
        light.turnOff(); // Stingem lumina
    }
}
