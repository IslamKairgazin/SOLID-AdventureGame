package enemies;

public class Vampire extends Enemy {
    public Vampire() { super("Vampire", 100); }

    @Override
    public void attack() {
        System.out.println(name + " drains blood!");
    }
}
