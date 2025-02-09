# **Adventure Game**

## **Project Description**
This project is a text-based game where the player fights enemies, uses items, and progresses through levels. We started with an old, monolithic codebase that was complex and hard to modify, and refactored it into a modular structure with separate classes.

---

## **Original Code (Before Changes)**
The entire logic was contained in one large class, **MonolithicAdventureGame**. It included:
- **Player management logic**: Health, inventory.
- **Combat logic**: Enemy attacks, damage calculations.
- **Level and item management**.

### **Problems with the old code:**
- **Difficult to modify**:
    - Any change required editing large portions of the code in a single class.
- **Violation of SRP (Single Responsibility Principle)**:
    - One class handled everything: players, enemies, levels, and items.
- **Limited scalability**:
    - Adding new enemies or items was difficult and required modifying existing code.

---

## **New Code (After Changes)**
We split the code into modules, with each class handling a single task:
- **Player**: Manages the player’s health, experience, and inventory.
- **Enemy**: Defines enemies, and its subclasses (`Skeleton`, `Zombie`, `Vampire`) implement different behaviors.
- **CombatManager**: Handles combat between the player and enemies.
- **ItemManager**: Manages items (e.g., potions).
- **LevelManager**: Controls level progression.
- **ScoreManager**: Tracks the player’s score.

### **What changed:**
- The code is now simpler: Each task is isolated in its own class.
- Adding new enemies, items, or levels is easy without modifying existing code.

---

## **Key Improvements**
- **Separation of Responsibilities (SRP)**:
    - Each class now handles only one aspect of the game. For example, `Player` manages the player’s state, and `CombatManager` handles battles.
- **Scalability (OCP)**:
    - New enemies or items can be added without altering the existing codebase.
- **Ease of Maintenance**:
    - The code is now easier to read, understand, and update.

---

## **How the Game Works**
1. The player starts with a set amount of health and money.
2. An enemy (e.g., `Skeleton`) appears and attacks the player.
3. The player can purchase and use potions to restore health.
4. After defeating the enemy, the player progresses to the next level.

---

## **Sample Output**
```plaintext
Player: Islam
Money: 1200 tenge
Health: 100 HP

The Skeleton appeared and struck!
Health: 80 HP

Islam bought a health potion
Money: 1000 tenge
Islam drinks a - Health potion!
Health: 90 HP

Level complete!
You advanced to Level 2!
