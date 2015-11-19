package net.lapasa.testdagger2eval;

/**
 * Created by admin on 11/18/2015.
 */
public class Vehicle {
    private Motor motor;

    public Vehicle(Motor motor) {
        this.motor = motor;
    }

    public void increaseSpeed(int value) {
        motor.accelerate(value);
    }

    public void stop() {
        motor.brake();
    }

    public int getSpeed() {
        return motor.getRpm();
    }
}
