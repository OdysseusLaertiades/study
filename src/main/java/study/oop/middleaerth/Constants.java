package study.oop.middleaerth;

import study.oop.middleaerth.model.Weapon;

public class Constants {

    public static final int MINIMAL_POWER = 5;
    public static final int DEFAULT_DWARF_HEALTH = 1000;
    public static final int DEFAULT_ORC_HEALTH = 1500;
    public static final int DEFAULT_OCR_STRAIGHT = 5;
    public static final Weapon DEFAULT_WEAPON = new Weapon("fists", 1);
    public static final Weapon DEFAULT_ORC_WEAPON = new Weapon(DEFAULT_WEAPON.getName(), DEFAULT_WEAPON.getPower() + DEFAULT_OCR_STRAIGHT);
}
