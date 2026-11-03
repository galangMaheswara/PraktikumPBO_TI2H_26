package Pertemuan10.Tugas;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void destroyed() {
        health = health - (health * 20 / 100);
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data = \n" + super.getZombieInfo();
    }

    @Override
    public void heal() {
        if (level == 1) {
            health = health + (health * 1 / 10);
        } else if (level == 2) {
            health = health + (health * 3 / 10);
        } else if (level == 3) {
            health = health + (health * 4 / 10);
        }
    }
}
