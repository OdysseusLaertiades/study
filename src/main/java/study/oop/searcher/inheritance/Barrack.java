package study.oop.searcher.inheritance;

import study.oop.searcher.inheritance.DwarfExtendsUnit.DwarfWarrior;
import study.oop.searcher.inheritance.ElfExtendsUnit.Elf;
import study.oop.searcher.inheritance.HumanExtendsUnit.Human;

public class Barrack {
    Human human = new Human(120, "sword");
    DwarfWarrior dwarfWarrior = new DwarfWarrior(100, "ax");
    Elf elf = new Elf(200, "onion");

    public void unitKilled(int damageHealth, int attackPower) {
        if (attackPower > 90 && attackPower < 100) {
            damageHealth = 100;
        } else {
            damageHealth = attackPower;
        }
        human.setHealth(damageHealth);
        dwarfWarrior.setHealth(damageHealth);
        elf.setHealth(damageHealth);

        if (human.getHealth() == 0){
            System.out.println("You human is died. Game Over!");
        }
        if (dwarfWarrior.getHealth() == 0){
            System.out.println("You dwarfWarrior is died. Game Over!");
        }
        if (elf.getHealth() == 0){
            System.out.println("You elf is died. Game Over!");
        }
    }
}

