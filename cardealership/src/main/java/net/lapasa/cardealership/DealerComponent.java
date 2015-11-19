package net.lapasa.cardealership;

import net.lapasa.cardealership.brands.CarBrandModule;
import net.lapasa.cardealership.brands.Ford;
import net.lapasa.cardealership.brands.Honda;
import net.lapasa.cardealership.brands.Toyota;

import dagger.Component;

/**
 * Created by admin on 11/19/2015.
 */

@Component(modules = {CarBrandModule.class})
public interface DealerComponent {
    Toyota provideToyota();
    Ford provideFord();
    Honda provideHonda();
}
