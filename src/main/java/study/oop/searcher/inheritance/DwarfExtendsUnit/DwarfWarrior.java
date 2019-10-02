package study.oop.searcher.inheritance.DwarfExtendsUnit;

import study.oop.searcher.inheritance.Unit;

import static java.lang.String.format;

public class DwarfWarrior extends Unit {
    private String weapon;
    private String sideMove;
    private boolean jumpActivate;
    private int lowBump;
    private int highBump;
    int maxSpeed;

    public DwarfWarrior(int maxSpeed, String weapon) {
        this.maxSpeed = maxSpeed;
        this.weapon = weapon;
    }

    public DwarfWarrior() {
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
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
                if (i > 10) {
                    setHealth(100 - i);
                }
            }
        } else {
            throw new IllegalArgumentException(format("your speed %s is unacceptably high", speed));
        }
        return sideMove;
    }

    @Override
    public void jump(int jumpHeight) {
        if (jumpHeight > 50) {
            jumpActivate = true;
        }
    }

    @Override
    public void bump(int impactStrength) {
        if (impactStrength > 80) {
            highBump = impactStrength;
            setHealth(170 - impactStrength);
        } else
            lowBump = impactStrength;
    }
}