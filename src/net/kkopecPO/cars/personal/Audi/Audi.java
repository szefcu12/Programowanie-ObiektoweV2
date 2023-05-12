package net.kkopecPO.cars.personal.Audi;

import net.kkopecPO.cars.personal.Personal;

public class Audi extends Personal {
    protected boolean is_stolen;

    public Audi(int horse_power, int door_count, boolean has_isofix) {
        super(horse_power, door_count, has_isofix);
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
