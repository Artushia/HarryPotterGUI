package org.java.isep.Model;

import lombok.Getter;
import lombok.Setter;

public abstract class Character {

    @Getter
    @Setter
    private int hp;


    public Character(int hp) {this.hp = hp;}
}

