package net.kkopec.cars;

import net.kkopec.exceptions.ArgumentListTooShortException;

public interface CarInterface {

    public String getCarName();

    public Car getNewInstance(Object... arguments) throws ArgumentListTooShortException;
}
