import net.kkopecPO.car_factory.Factory;
import net.kkopecPO.cars.personal.Audi.Audi;
import net.kkopecPO.cars.personal.Audi.AudiInstruction;
import net.kkopecPO.cars.personal.Personal;
import net.kkopecPO.cars.personal.Volkswagen.Volkswagen;
import net.kkopecPO.cars.personal.Volkswagen.VolkswagenInstruction;
import net.kkopecPO.serializer.Serializer;
import net.kkopecPO.cars.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Serializer serializer = new Serializer();
        Factory factory = new Factory();

        List<Car> cars = new ArrayList<>();

        factory.addInstruction(new AudiInstruction());
        factory.addInstruction(new VolkswagenInstruction());

        cars.add(factory.getCarByName("Volkswagen"));
        cars.add(factory.getCarByName("Audi"));



        for (Car car: cars) {
            try {
                System.out.println(car.getHorse_power() + " " + car.getDoor_count());
                if(car instanceof Personal) {
                    Personal personal = ((Personal) car);
                    System.out.println(personal.getHasIsoFix());
                    if(personal instanceof Volkswagen) {
                        Volkswagen volvo = ((Volkswagen) personal);
                        System.out.println(volvo.getHeatedSeats());
                    } else if (personal instanceof Audi) {
                        Audi fiat = ((Audi) personal);
                        System.out.println(fiat.getIsStolen());
                    }
                }
            } catch (NullPointerException error) {
                System.out.println("Instance of " + car + " in not an car");
            }
        }

        serializer.serialize("cars.dat", cars);
    }
}