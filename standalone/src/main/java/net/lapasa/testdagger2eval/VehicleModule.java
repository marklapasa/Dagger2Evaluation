package net.lapasa.testdagger2eval;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class VehicleModule {


    /**
     * Provide a singleton of a motor
     *
     * @return
     */
    @Provides
    @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    /**
     * Provide a Vehicle singleton with a motor
     * @return
     */
    @Provides
    @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }
}
