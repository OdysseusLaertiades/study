package study.oop.middleaerth.model;

import static study.oop.middleaerth.Constants.*;

public class Orc extends Unit {

    public Orc() {
        this(DEFAULT_ORC_HEALTH, DEFAULT_ORC_WEAPON);
    }

    public Orc(int health, Weapon weapon) {
        super(health, weapon);
    }

    @Override
    int getSpecialConditionsOfAttackPower() {
        return getWeapon().getPower();
    }

}
