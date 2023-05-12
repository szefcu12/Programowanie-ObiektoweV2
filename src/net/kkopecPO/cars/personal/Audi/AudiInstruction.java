package net.kkopecPO.cars.personal.Audi;

import net.kkopecPO.cars.Car;
import net.kkopecPO.cars.CarInstruction;

public class AudiInstruction implements CarInstruction {
    @Override
    public String getCarName() {
        return "Audi";
    }

    @Override
    public Car getNewInstance() {
        return new Audi(130,5,true);
    }
}
