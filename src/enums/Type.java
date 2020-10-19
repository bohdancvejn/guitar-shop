package enums;

public enum Type {
    ACOUSTIC, ELECTRIC;

    @Override
    public String toString() {
        switch (this) {
            case ACOUSTIC:
                return "Acoustic";
            case ELECTRIC:
                return "Electric";
            default:
                throw new IllegalStateException("Unexpected value: " + this);
        }
    }
}
