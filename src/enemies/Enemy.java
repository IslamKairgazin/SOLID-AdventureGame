package enemies;

public abstract class Enemy {
    protected String name;
    protected int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        health = Math.max(health - damage, 0);
    }

    public abstract void attack();
}
