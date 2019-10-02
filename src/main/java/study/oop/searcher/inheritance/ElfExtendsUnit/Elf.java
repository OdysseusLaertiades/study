package study.oop.searcher.inheritance.ElfExtendsUnit;

import study.oop.searcher.inheritance.DwarfExtendsUnit.DwarfWarrior;
import study.oop.searcher.inheritance.Unit;

import static java.lang.String.format;

public class Elf extends Unit {
    private DwarfWarrior dwar = new DwarfWarrior();
    private String weapon = dwar.getWeapon();
    private String sideMove;
    private boolean jumpActivate;
    private int lowBump;
    private int highBump;
    int maxSpeed;

    public Elf(int maxSpeed, String weapon) {
        this.maxSpeed = maxSpeed;
        this.weapon = weapon;
    }

    public Elf() {
    }

    @Override
    public String move(int side, int speed) {
        if (side == 1)
            sideMove = "direct";
        if (side == 0)
            sideMove = "back";
        if (side == 2)
            sideMove = "right";
        if (side == -1)
            sideMove = "left";
        if (speed < maxSpeed) {
            for (int i = 0; i < speed; i++) {
                if (i > 180) {
                    setHealth(200 - i);
                }
            }
        } else {
            throw new IllegalArgumentException(format("your speed %s is unacceptably high", speed));
        }
        return sideMove;
    }

    @Override
    public void jump(int jumpHeight) {
        if (jumpHeight > 20) {
            jumpActivate = true;
        }
    }

    @Override
    public void bump(int impactStrength) {
        if (impactStrength > 30) {
            highBump = impactStrength;
            setHealth(120 - impactStrength);
        } else
            lowBump = impactStrength;
    }
}
