package mainpackage.impl;

import mainpackage.Car;
import org.springframework.stereotype.Service;

/**
 * Create class Ritz which implements Car
 * Created by vijitha on 07/09/16.
 */
@Service("Ritz")
public class Ritz implements Car {
    public void carName() {
        System.out.println("mainpackage.Car name is Ritz");    }
}
