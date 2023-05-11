package org.java.isep.Model;

import lombok.Getter;
import lombok.Setter;

public class House {

    @Getter
    @Setter
    private String name;

    public House(String name) {
        this.name = name;
    }

    @Override
    public String toString() {return name;}
}
