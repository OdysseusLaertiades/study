package study.oop.middleaerth.model;

public class Weapon {

    private final String name;
    private final int power;

    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
