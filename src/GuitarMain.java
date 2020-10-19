import enums.Builder;
import enums.Type;
import enums.Wood;

import java.util.List;
import java.util.Scanner;

public class GuitarMain {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Scanner scanner = new Scanner(System.in);
        GuitarSpec guitarSpec = new GuitarSpec();

        //print what is in the inventory
        System.out.println("\nAll items in the inventory:\n" + inventory.toString() + "\n" +
                "---------------------------------------------------------------------------");

        System.out.println("What guitar are you looking for?");
        System.out.println("Builder: ");
        guitarSpec.setBuilder(Enum.valueOf(Builder.class, scanner.nextLine().toUpperCase()));
        System.out.println("Model: ");
        guitarSpec.setModel(scanner.nextLine());
        System.out.println("Type: ");
        guitarSpec.setType(Enum.valueOf(Type.class, scanner.nextLine().toUpperCase()));
        System.out.println("Back Wood: ");
        guitarSpec.setBackWood(Enum.valueOf(Wood.class, scanner.nextLine().toUpperCase()));
        System.out.println("Top Wood: ");
        guitarSpec.setTopWood(Enum.valueOf(Wood.class, scanner.nextLine().toUpperCase()));
        System.out.println("Number of Strings: ");
        guitarSpec.setNumString(scanner.nextInt());

        List<Guitar> results = inventory.search(guitarSpec);

        if (results.isEmpty()) {
            System.out.println("I am sorry.. but I do not have such a guitar in my inventory.");
        } else {
            System.out.println("I have something for you: \n" +
                    results.toString());
        }
    }

    public static void initializeInventory(Inventory inventory) {

        //fill in some testing data
        GuitarSpec guitarSpec1 = new GuitarSpec(Builder.FENDER, "CoolBC", Type.ELECTRIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.ALDER, 5);
        inventory.addGuitar(new Guitar("BC001", 1999.9, guitarSpec1));

        GuitarSpec guitarSpec2 = new GuitarSpec(Builder.FENDER, "CoolBC", Type.ELECTRIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.ALDER, 12);
        inventory.addGuitar(new Guitar("BC002", 2199.9, guitarSpec2));

        GuitarSpec guitarSpec3 = new GuitarSpec(Builder.COLLINGS, "BC_coll", Type.ACOUSTIC,
                Wood.INDIAN_ROSEWOOD, Wood.MAHOGANY, 5);
        inventory.addGuitar(new Guitar("BC003", 2499.9, guitarSpec3));

        GuitarSpec guitarSpec4 = new GuitarSpec(Builder.OLSON, "Ols_BC", Type.ACOUSTIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK, 12);
        inventory.addGuitar(new Guitar("BC004", 1499.9, guitarSpec4));
    }
}
