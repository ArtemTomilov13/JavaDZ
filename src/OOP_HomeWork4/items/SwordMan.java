package OOP_HomeWork4.items;

import OOP_HomeWork4.weapons.Sword;

public class SwordMan extends Warrior<Sword> {
    public SwordMan(String name, Sword weapon) {
        super(name, weapon);
    }


    @Override
    public String toString() {
        return super.toString() + " Type = SwordMan";
    }

    @Override
    public int damage() {
        return 0;
    }

    @Override
    public int protection() {
        return 0;
    }
}
