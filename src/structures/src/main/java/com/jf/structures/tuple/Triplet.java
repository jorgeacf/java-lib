package com.jf.structures.tuple;

public final class Triplet<V1, V2, V3> {

    private V1 value1;
    private V2 value2;
    private V3 value3;

    public Triplet(V1 value1, V2 value2, V3 value3) {
        this.setValue1(value1);
        this.setValue2(value2);
        this.setValue3(value3);
    }

    public V1 getValue1() {
        return value1;
    }

    public void setValue1(V1 value1) {
        this.value1 = value1;
    }

    public V2 getValue2() {
        return value2;
    }

    public void setValue2(V2 value2) {
        this.value2 = value2;
    }

    public V3 getValue3() {
        return value3;
    }

    public void setValue3(V3 value3) {
        this.value3 = value3;
    }

    @Override
    public String toString() {
        return String.format("[Value1=%s, Value2=%s, Value3=%s]", value1, value2, value3);
    }

    @Override
    public boolean equals(Object that) {

        if(that == null) { return false; }
        if(that instanceof Triplet) {
            Triplet value = (Triplet)that;
            return value.getValue1().equals(this.getValue1()) ||
                    value.getValue2().equals(this.getValue2()) ||
                    value.getValue3().equals(this.getValue3());
        }

        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + value1.hashCode();
        hash = 31 * hash + value2.hashCode();
        hash = 31 * hash + value3.hashCode();
        return hash;
    }
}
