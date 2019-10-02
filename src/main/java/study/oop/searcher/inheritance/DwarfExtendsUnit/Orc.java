package study.oop.searcher.inheritance.DwarfExtendsUnit;

import static java.lang.String.format;

public class Orc extends DwarfWarrior {

    public void rage(int levelRage) {
        if (levelRage > 90 && levelRage <= 100) {
            setHealth(Integer.toString(100 - levelRage));
            setWeapon(null);
            jump(100 - levelRage);
            bump(100 - levelRage);
        } else {
            throw new IllegalArgumentException(format("your levelRage %d is unacceptably high", levelRage));
        }

    }
}
