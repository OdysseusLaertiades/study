package study.oop.middleaerth.model;

import static java.lang.String.format;
import static study.oop.middleaerth.Constants.MINIMAL_POWER;

import study.oop.middleaerth.UnitBehaviour;

public abstract class Unit implements UnitBehaviour {

    private int health;
    private Weapon weapon;

    public Unit(int health, Weapon weapon) {
        this.weapon = weapon;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public int getAttackPower() {
        return MINIMAL_POWER + getSpecialConditionsOfAttackPower();
    }

    abstract int getSpecialConditionsOfAttackPower();

    @Override
    public String toString() {
        return format(
                "\n Unit %s \n health = %s \n weapon = %s",
                this.getClass().getSimpleName().toLowerCase(), health, weapon
        );

    }
}
