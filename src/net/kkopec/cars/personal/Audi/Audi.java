package net.kkopec.cars.personal.Audi;

import net.kkopec.cars.personal.Personal;

public class Audi extends Personal {
    protected boolean is_stolen;

    public Audi(Object... arguments) {
        super(arguments);
        this.is_stolen = determine_is_stolen();
    }

    private boolean determine_is_stolen() {
        return Math.random() < 0.5;
    }

    public boolean getIsStolen() {
        return is_stolen;
    }

    public void setIsStolen(boolean is_stolen) {
        this.is_stolen = is_stolen;
    }
}
