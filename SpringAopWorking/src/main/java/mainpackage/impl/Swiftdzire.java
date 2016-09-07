package mainpackage.impl;

import mainpackage.Car;
import org.springframework.stereotype.Service;

/**
 * Create class Swiftdzire which implements Car
 * Created by vijitha on 07/09/16.
 */
@Service("Swiftdzire")
public class Swiftdzire implements Car {
    public void carName() {
        System.out.println("mainpackage.Car name is Swiftdzire");    }
}
