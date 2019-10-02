package study.oop.searcher.inheritance.ElfExtendsUnit;

public class BloodElf extends Elf {
    private String hungry;

    public BloodElf() {
    }

    public void lifeDrain(int health) {
        if (health < 50) {
            hungry = "suck blood";
        }
    }
}
