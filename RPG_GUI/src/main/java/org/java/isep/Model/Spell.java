package org.java.isep.Model;

public class Spell extends AbstractSpell {

    public Spell(String name, double percentSuccess, int damage) {
        this.name = name;
        this.percentSuccess = percentSuccess;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return name;
    }
}