package net.kkopec.cars.personal.Audi;

import net.kkopec.cars.Car;
import net.kkopec.cars.CarInterface;
import net.kkopec.exceptions.ArgumentListTooShortException;

public class AudiInstruction implements CarInterface {
    @Override
    public String getCarName() {
        return "Audi";
    }

    @Override
    public Car getNewInstance(Object... arguments) throws ArgumentListTooShortException {
        int given_length = arguments.length;
        int expected_length = 5;
        if (given_length == expected_length) {
            return new Audi(arguments);
        }
        throw new ArgumentListTooShortException(expected_length, given_length);
    }
}
