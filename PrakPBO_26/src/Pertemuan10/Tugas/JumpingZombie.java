package Pertemuan10.Tugas;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void destroyed() {
        health = health - (health * 10 / 100);
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data = \n" + super.getZombieInfo();
    }

    @Override
    public void heal() {
        if (level == 1) {
            health = health + (health * 3 / 10);
        } else if (level == 2) {
            health = health + (health * 4 / 10);
        } else if (level == 3) {
            health = health + (health * 5 / 10);
        }
    }
}
