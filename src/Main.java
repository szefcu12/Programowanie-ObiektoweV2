package Tree;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        ArrayList<String> words = new ArrayList<String>();

        words.add("Adam");
        words.add("Testing");
        words.add("Jakiś długi tekst dla testu");
        words.add("PKP");
        words.add("Adam");
        words.add("Natalia");
        words.add("Mikołaj");
        words.add("Damian");
        words.add("RazDwaTrzyPatrzyszTy");
        words.add("Mikołaj");

        for (String word : words) {
            try {
                tree.add(word);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            tree.delete("Testing");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        tree.display();

        Boolean shouldBeTrue = tree.findValue("Adam");

        System.out.println("Czy w drzewie znajduje się wartość 'Adam'? " + shouldBeTrue.toString());

        try {
            tree.delete("Adam");

            // This should throw an exception
            tree.delete("Adam");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Czy w drzewie znajduje się wartość 'Adam'? " + tree.findValue("Adam").toString());
        System.out.println("Minimalna wartość: " + tree.getMin().toString());
        System.out.println("Maksymalna wartość: " + tree.getMax().toString());
        System.out.println("Liczba elementów w drzewie: " + tree.getNodesCount().toString());

        // Operacje na pustym drzewie
        tree.clear();

        try {
            tree.displayAsc();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}