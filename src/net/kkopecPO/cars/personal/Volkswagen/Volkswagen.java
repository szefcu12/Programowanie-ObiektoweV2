package net.kkopecPO.cars.personal.Volkswagen;

import net.kkopecPO.cars.personal.Personal;

public class Volkswagen extends Personal {
    protected boolean heated_seats;

    public Volkswagen(int horse_power, int door_count, boolean has_isofix) {
        super(horse_power, door_count, has_isofix);
        this.heated_seats = determine_has_heated_seats();
    }

    private boolean determine_has_heated_seats() {
        return Math.random() < 0.5;
    }

    public boolean getHeatedSeats() {
        return heated_seats;
    }
}
