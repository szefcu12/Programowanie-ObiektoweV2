package net.kkopec.cars.personal;

import net.kkopec.cars.Car;

public abstract class Personal extends Car {

    protected boolean has_isofix;

    public Personal(Object... arguments) {
        super(arguments);
        this.has_isofix = (boolean) arguments[4];
    }
    public boolean getHasIsoFix() {
        return has_isofix;
    }

    public void setHasIsoFix(boolean has_isofix) {
        this.has_isofix = has_isofix;
    }
}
