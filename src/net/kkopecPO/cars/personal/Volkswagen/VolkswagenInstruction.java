package net.kkopecPO.cars.personal.Volkswagen;

import net.kkopecPO.cars.Car;
import net.kkopecPO.cars.CarInstruction;

public class VolkswagenInstruction implements CarInstruction {
    @Override
    public String getCarName() {
        return "Volkswagen";
    }

    @Override
    public Car getNewInstance() {
        return new Volkswagen(101,4,false);
    }
}
