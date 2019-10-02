package study.oop.searcher.inheritance.HumanExtendsUnit;

import study.oop.searcher.inheritance.DwarfExtendsUnit.DwarfWarrior;
import study.oop.searcher.inheritance.Unit;

import static java.lang.String.format;

public class Human extends Unit {
    private DwarfWarrior dwar = new DwarfWarrior();
    private String weapon = dwar.getWeapon();
    private String hourceRun;
    private String sideMove;
    private boolean jumpActivate;
    private int lowBump;
    private int highBump;
    int maxSpeed;

    public Human(int maxSpeed, String weapon) {
        this.maxSpeed = maxSpeed;
        this.weapon = weapon;
    }

    public Human() {

    }

    public void horseRiding(String runningDirection) {
        if (runningDirection.equals("left")) {
            hourceRun = "left";
        } else if (runningDirection.equals("right")) {
            hourceRun = "right";
        } else if (runningDirection.equals("direct")) {
            hourceRun = "direct";
        } else {
            throw new IllegalArgumentException(format("your direction %s is unacceptable", runningDirection));
        }
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
                if (i > 100) {
                    setHealth(120 - i);
                }
            }
        } else {
            throw new IllegalArgumentException(format("your speed %s is unacceptably high", speed));
        }
        return sideMove;
    }

    @Override
    public void jump(int jumpHeight) {
        if (jumpHeight > 30) {
            jumpActivate = true;
        }
    }

    @Override
    public void bump(int impactStrength) {
        if (impactStrength > 50) {
            highBump = impactStrength;
            setHealth(140 - impactStrength);
        } else
            lowBump = impactStrength;
    }
}
