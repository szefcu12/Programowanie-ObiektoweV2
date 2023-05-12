package net.kkopecPO.car_factory;

import net.kkopecPO.cars.Car;
import net.kkopecPO.cars.CarInstruction;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private Map<String, CarInstruction> instructions;

    public Factory() {
        this.instructions = new HashMap<>();
    }

    public void addInstruction(CarInstruction instruction) {
        this.instructions.put(instruction.getCarName(), instruction);
    }

    public Car getCarByName(String name) {
        try {
            CarInstruction instruction = this.instructions.get(name);
            return instruction.getNewInstance();
        } catch (NullPointerException error) {
            System.out.println("No such car");
        }
        return null;
    }

}

//{
//
//
//}