package main.personnage;
/**
 *
 * @author moulard
 */
public class Monster extends GameCharacter {
    public Monster(String name, int strength, int health, int gold) {
        super(name, strength, health, gold);
    }
    
    /**
     * Kill the monster.
     */
    public void die() {
        
    }
    @Override
    public String toString() {
        return "Monster{" + '}';
    }
}