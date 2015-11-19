package net.lapasa.cardealership.brands;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CarBrandModule {

    @Provides
    Toyota provideToyota() {
        return new Toyota();
    }

    @Provides
    Ford provideFord() {
        return new Ford();
    }

    @Provides
    Honda provideHonda() {
        return new Honda();
    }

}
