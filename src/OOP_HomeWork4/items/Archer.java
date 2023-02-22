
package OOP_HomeWork4.items;

import OOP_HomeWork4.weapons.Bow;

public class Archer extends Warrior<Bow> implements DistanceAttacker {
    private int distance;

    public Archer(String name, Bow weapon) {
        super(name, weapon);

        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = Archer{" +
                "distance=" + distance +
                '}';
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
