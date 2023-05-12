import net.kkopecPO.cars.Car;
import net.kkopecPO.serializer.Serializer;
import java.util.List;

public class Deserialized {
    public static void main(String[] args) {
        Serializer serializer = new Serializer();

        List<Car> cars = serializer.deserialize("cars.dat");

        for (Car car: cars) {
            System.out.println(car.getHorse_power() + " " + car.getDoor_count());
        }
    }
}
