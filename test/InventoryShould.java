import enums.Builder;
import enums.Type;
import enums.Wood;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InventoryShould {

    @Test
    public void addGuitarIntoInventory() {
        Inventory inventory = new Inventory();
        Guitar testGuitar1 = new Guitar("BC007", 555.55, new GuitarSpec(Builder.FENDER,
                "Cool Model", Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ALDER, 5));
        Guitar testGuitar2 = new Guitar("BC008", 555.55, new GuitarSpec(Builder.FENDER,
                "Cool Model", Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ALDER, 12));

        inventory.addGuitar(testGuitar1);
        assertNotNull(inventory);
        assertEquals(testGuitar1, inventory.getGuitar(testGuitar1.getSerialNumber()));
        assertNotEquals(testGuitar2, inventory.getGuitar(testGuitar2.getSerialNumber()));
    }

    @Test
    void searchGuitarBasedOnGuitarSpec() {
        Inventory inventory = new Inventory();
        Guitar testGuitar1 = new Guitar("BC007", 555.55, new GuitarSpec(Builder.FENDER,
                "Cool Model", Type.ELECTRIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ALDER, -4));

        GuitarSpec testGuitarSpec1 = testGuitar1.getGuitarSpec();

        inventory.addGuitar(testGuitar1);

        assertEquals(List.of(testGuitar1), inventory.search(testGuitarSpec1));
    }

}