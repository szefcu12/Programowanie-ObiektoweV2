package net.kkopec.cars.personal.Volkswagen;

import net.kkopec.cars.Car;
import net.kkopec.cars.CarInterface;
import net.kkopec.exceptions.ArgumentListTooShortException;

public class VolkswagenInstruction implements CarInterface {
    @Override
    public String getCarName() {
        return "Volkswagen";
    }

    @Override
    public Car getNewInstance(Object... arguments) throws ArgumentListTooShortException {
        int given_length = arguments.length;
        int expected_length = 5;
        if (given_length == expected_length) {
            return new Volkswagen(arguments);
        }
        throw new ArgumentListTooShortException(expected_length, given_length);
    }
}
