package net.lapasa.testdagger2eval;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {VehicleModule.class})

public interface VehicleComponent {
    Vehicle provideVehicle();
}