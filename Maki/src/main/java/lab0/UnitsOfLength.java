package lab0;

public enum UnitsOfLength {
    DECIMETER(0.1f), KILOMETER(1000), METER(1), MILLIMETER(0.001f), CENTIMETER(0.01f);

    private float length;

    UnitsOfLength(float length) {
        this.length = length;
    }

    public float intGetLength() {
        return length;
    }

    public static UnitsOfLength byOrdinal2ndWay(int ord) {
        return UnitsOfLength.values()[ord-1];
    }
}
