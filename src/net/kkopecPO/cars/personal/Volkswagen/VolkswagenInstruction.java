package net.kkopecPO.cars.personal.Volkswagen;

import net.kkopecPO.cars.Car;
import net.kkopecPO.cars.CarInstruction;

public class VolkswagenInstruction implements CarInstruction {
    @Override
    public String getCarName() {
        return "Volvo";
    }

    @Override
    public Car getNewInstance() {
        return new Volkswagen(90,5,false);
    }
}
