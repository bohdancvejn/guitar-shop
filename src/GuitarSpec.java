import enums.Builder;
import enums.Type;
import enums.Wood;

import java.util.Objects;

public class GuitarSpec {

    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    //number of guitar stings (5, 12, etc.)
    private int numString;

    public GuitarSpec() {
    }

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numString = numString;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    public int getNumString() {
        return numString;
    }

    public void setNumString(int numString) {
        this.numString = numString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GuitarSpec)) return false;
        GuitarSpec that = (GuitarSpec) o;
        return getNumString() == that.getNumString() &&
                getBuilder() == that.getBuilder() &&
                getModel().equals(that.getModel()) &&
                getType() == that.getType() &&
                getBackWood() == that.getBackWood() &&
                getTopWood() == that.getTopWood();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBuilder(), getModel(), getType());
    }
}
