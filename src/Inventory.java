import enums.Builder;
import enums.Type;
import enums.Wood;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        Guitar newGuitar = new Guitar(serialNumber, price, guitarSpec);

        guitars.add(newGuitar);
    }

    public void addGuitar(Guitar newGuitar) {
        guitars.add(newGuitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Object o : guitars) {
            Guitar guitar = (Guitar) o;
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "{" +
                "guitars: \n" + guitars + "\n" +
                '}';
    }

    public List search(GuitarSpec searchedGuitarSpec) {

        List matchingGuitars = new LinkedList();

        for (Object o : guitars) {
            Guitar guitar = (Guitar) o;

            if (guitar.getGuitarSpec().equals(searchedGuitarSpec)) {
                matchingGuitars.add(guitar);
            }
        }

        return matchingGuitars;
    }

}
