package enemies;

public class Skeleton extends Enemy {
    public Skeleton() { super("Skeleton", 50); }

    @Override
    public void attack() {
        System.out.println(name + " swings a sword!");
    }
}
