package study.oop.searcher.inheritance;

public abstract class Unit {

        private int health;
        private String experience;
        private String force;

        public Unit(int health, String experience, String force) {
            this.health = health;
            this.experience = experience;
            this.force = force;
        }

        public Unit() {
        }

        public abstract String move(int side, int speed);

        public abstract void jump(int jumpHeight);

        public abstract void bump(int impactStrength);

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public String getExperience() {
            return experience;
        }

        public void setExperience(String experience) {
            this.experience = experience;
        }

        public String getForce() {
            return force;
        }

        public void setForce(String force) {
            this.force = force;
        }
    }


