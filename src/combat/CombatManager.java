package combat;

import player.Player;
import enemies.Enemy;

public class CombatManager {
    public void fight(Player player, Enemy enemy) {
        System.out.println("A wild " + enemy.getClass().getSimpleName() + " appears!");
        enemy.attack();
        player.takeDamage(20);
        System.out.println("Player health: " + player.getHealth());
    }
}
