package study.oop.searcher.inheritance.HumanExtendsUnit;

public class Scientist extends Human {
    private String mind;
    private String develop = "God";
    private Human human = new Human();

    public Scientist(String mind) {
        this.mind = mind;
    }

    public Scientist() {

    }

    public void humanDevelopment (String mind) {
        if(mind.equals(develop)) {
            human.maxSpeed = 200;
        }
    }
}
