package net.kkopec.cars.personal.Volkswagen;

import net.kkopec.cars.personal.Personal;

public class Volkswagen extends Personal {
    protected boolean heated_seats;

    public Volkswagen(Object... arguments) {
        super(arguments);
        this.heated_seats = determine_has_heated_seats();
    }

    private boolean determine_has_heated_seats() {
        return Math.random() < 0.5;
    }

    public boolean getHeatedSeats() {
        return heated_seats;
    }
}
