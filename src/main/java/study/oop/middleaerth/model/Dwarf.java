package study.oop.middleaerth.model;

import static study.oop.middleaerth.Constants.DEFAULT_DWARF_HEALTH;
import static study.oop.middleaerth.Constants.DEFAULT_WEAPON;

import java.util.concurrent.ThreadLocalRandom;

public class Dwarf extends Unit {

    public Dwarf() {
        this(DEFAULT_DWARF_HEALTH, DEFAULT_WEAPON);
    }

    public Dwarf(int health, Weapon weapon) {
        super(health, weapon);
    }

    @Override
    int getSpecialConditionsOfAttackPower() {
        return isHealthLessThanHalf() && isNotDeathYet() ? multiplyPower() : getWeapon().getPower();
    }

    private int multiplyPower() {
        return getWeapon().getPower() + ThreadLocalRandom.current().nextInt(0, 15);
    }

    private boolean isHealthLessThanHalf() {
        return getHealth() < DEFAULT_DWARF_HEALTH / 2;
    }

    private boolean isNotDeathYet() {
        return getHealth() > 0;
    }
}
