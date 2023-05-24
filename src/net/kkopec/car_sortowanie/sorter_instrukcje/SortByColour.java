package net.kkopec.car_sortowanie.sorter_instrukcje;

import net.kkopec.cars.Car;

import java.util.Comparator;

public class SortByColour implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int value = o1.getColour().compareTo(o2.getColour());
        if (value == 0){
            System.out.println("Kolory takie same");
        }
        return value;
    }
}