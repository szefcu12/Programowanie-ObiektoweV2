package net.kkopecPO.cars.personal.Audi;

import net.kkopecPO.cars.Car;
import net.kkopecPO.cars.CarInstruction;

public class AudiInstruction implements CarInstruction {
    @Override
    public String getCarName() {
        return "Fiat";
    }

    @Override
    public Car getNewInstance() {
        return new Audi(85,3,true);
    }
}
