package player;

import items.ItemManager;

public class Player {
    private String name;
    private int health;
    private int experience;
    private ItemManager inventory;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.experience = 0;
        this.inventory = new ItemManager();
    }

    public void takeDamage(int damage) {
        health = Math.max(health - damage, 0);
    }

    public void heal(int amount) {
        health += amount;
    }

    public void addExperience(int xp) {
        experience += xp;
    }

    public int getHealth() { return health; }
    public ItemManager getInventory() { return inventory; }
}
