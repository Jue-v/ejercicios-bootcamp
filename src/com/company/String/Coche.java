package com.company.String;

public class Coche {
    String name = "nobre de coche";

    public Coche() {}

    public Coche(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "name='" + name + '\'' +
                '}';
    }
}
