package main.item;
import main.personnage.*;
/**
 * Abstract class for all Items in the Game
 *
 * @author deregnaucourt
 */
public abstract class Item {
    public Item() {
    }
    /**
     * Does an effect on the Player p
     *
     * @param p Player
     */
    public abstract void isUsedBy(Player p);
    @Override
    public String toString() {
        return super.toString();
    }
}