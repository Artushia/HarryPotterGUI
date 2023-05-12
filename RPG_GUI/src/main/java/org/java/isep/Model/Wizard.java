package org.java.isep.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Wizard extends Character {

    @Getter
    @Setter
    String name;

    @Getter
    @Setter
    String house;

    @Getter
    @Setter
    String pet;

    @Getter
    @Setter
    String wand;

    @Getter
    @Setter
    int wandLength;

    @Getter
    @Setter
    List<Spell> knownSpells = new ArrayList<>();

    public Wizard(int hp) {
        super(hp);

        Spell Leviosa = new Spell("Wanguardium Leviosa", 0.25, 20);
        knownSpells.add(Leviosa);
    }
}
