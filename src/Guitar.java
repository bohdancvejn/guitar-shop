import java.util.Objects;

public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpec guitarSpec;

    public Guitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarSpec = guitarSpec;
    }

    @Override
    public boolean equals(Object o) {
        //testing if the objects point to the same instance
        if (this == o) return true;

        //testing if the object is null or not a Guitar type
        if (o == null || getClass() != o.getClass()) return false;

        //if both "hard" checks pass, then I test the equality
        Guitar guitar = (Guitar) o;
        return serialNumber.equals(guitar.serialNumber) &&
                guitarSpec.getModel().equals(guitar.guitarSpec.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, guitarSpec.getModel());
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public GuitarSpec getGuitarSpec() {
        return guitarSpec;
    }

    public void setGuitarSpec(GuitarSpec guitarSpec) {
        this.guitarSpec = guitarSpec;
    }

    @Override
    public String toString() {
        return "We have a guitar [serialNumber] = '" + serialNumber + "',\n" +
                "builder='" + guitarSpec.getBuilder() + '\'' +
                ", model='" + guitarSpec.getModel() + '\'' +
                ", type='" + guitarSpec.getType() + '\'' +
                ", backWood='" + guitarSpec.getBackWood() + '\'' +
                ", topWood='" + guitarSpec.getTopWood() + '\'' +
                ", numStrings='" + guitarSpec.getNumString() + '\'' +
                "\nYou can have it for $" + this.getPrice() +
                "\n----\n}";
    }
}
