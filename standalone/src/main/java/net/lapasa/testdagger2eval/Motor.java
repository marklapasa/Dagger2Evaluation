package net.lapasa.testdagger2eval;

/**
 * Created by admin on 11/18/2015.
 */
public class Motor {

    private int rpm;

    public Motor() {
        this.rpm = 10;
    }

    public int getRpm() {
        return rpm;
    }

    public void accelerate(int value) {
        rpm = rpm + value;
    }

    public void brake() {
        rpm = 0;
    }
}
