public class MainGame {
    public static void main(String[] args) {
        String playerName = "Islam";
        int playerHealth = 100;
        int playerMoney = 1200;
        int potionCost = 200;

        System.out.println("Player: " + playerName);
        System.out.println("Money: " + playerMoney + " tenge");
        System.out.println("Health: " + playerHealth + " HP\n");

        System.out.println("The Skeleton appeared and struck!");
        playerHealth -= 20;
        System.out.println("Health: " + playerHealth + " HP\n");

        System.out.println(playerName + " bought a health potion");
        playerMoney -= potionCost;
        System.out.println("Money: " + playerMoney + " tenge");

        System.out.println(playerName + " drinks a - Health potion!");
        playerHealth += 10;
        System.out.println("Health: " + playerHealth + " HP\n");

        System.out.println("Level complete!");
        System.out.println("You advanced to Level 2!");
    }
}
