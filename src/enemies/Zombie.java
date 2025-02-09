package enemies;

public class Zombie extends Enemy {
    public Zombie() { super("Zombie", 70); }

    @Override
    public void attack() {
        System.out.println(name + " bites the player!");
    }
}
