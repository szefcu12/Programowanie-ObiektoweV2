package net.kkopec.serializer;

import net.kkopec.cars.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serializer {
    public List<Car> deserialize(String filename) {
        List<Car> deserialized_data = null;
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserialized_data = (ArrayList<Car>) in.readObject();
            in.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje!");
            return null;
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("Klasa nieznaleziona");
            c.printStackTrace();
            return null;
        }
       return deserialized_data;
    }

    public void serialize(String output_file, List<Car> serialized_objects) {
        try {
            FileOutputStream fileOut = new FileOutputStream(output_file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(serialized_objects);
            out.close();
            fileOut.close();
            System.out.print("Dane zapisane w:  " + output_file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
