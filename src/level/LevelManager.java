package level;

public class LevelManager {
    private int currentLevel = 1;

    public void levelUp() {
        currentLevel++;
        System.out.println("Level up! Current level: " + currentLevel);
    }
}
