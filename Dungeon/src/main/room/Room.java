package main.room;
import main.personnage.*;
import main.item.*;
import java.util.List;
import java.util.Map;
/**
 * This class describe a room
 * @author deregnaucourt
 */
public class Room {
    private List<Monster> monsters;
    private List<Item> items;
    private Map<Direction, Room> neighbors;
    private String name;
    
    public Room(String name) {
        this.name = name;
    }
    /**
     * Return list of all monsters in the room.
     * @return The list of monsters.
     */
    public List<Monster> getMonsters() {
        return monsters;
    }
    /**
     * Returns the list of items for the room.
     * @return The list of items.
     */
    public List<Item> getItems() {
        return items;
    }
    
    /**
     * Return the the first occurrence of the room by specified direction.
     * @param direction - Diection of wanted room
     * @return Room pointed by specified direction
     */
    public Room getNeighbor(Direction direction) {
        return null;
    }
    /**
     * Return each directions of neighbors rooms.
     * @return - The neighbors direction list
     */
    public List<Direction> getNeighborDirections() {
        return null;
    }
    /**
     * Returns the name of the entity.
     * @return name of the room represented by this object.
     */
    public String getName() {
        return name;
    }
    /**
     * Add the specified monster to the current monsters list.
     * @param monster - monster to be added.
     */
    public void addMonsters(Monster monster) {
        this.monsters.add(monster);
    }
    
    /**
     * Remove the specified monster from the current monsters list.
     * @param monster - monster to be removed
     */
    public void removeMonster(Monster monster) {
        
    }
    /**
     * Add an item in this room.
     * @param item - item to be added to the room.
     */
    public void addItems(Item item) {
        this.items.add(item);
    }
    
    /**
     * Add given room in current neighbors list.
     * @param direction - position of room in space
     * @param room - room to be added as neighbors
     */
    public void addNeighbors(Direction direction, Room room) {
        this.neighbors.put(direction, room);
    }
    
    /**
     * Return if this instance is an exit room.
     * @return true if it is an exit room.
     */
    public boolean isExit() {
        return false;
    }
    
    /**
     * Removes the first occurrence of the specified item from this list
     * ,if it is present.
     * @param item - item to be removed from this list, if present
     */
    public void removeItem(Item item) {
        
    }
    
}