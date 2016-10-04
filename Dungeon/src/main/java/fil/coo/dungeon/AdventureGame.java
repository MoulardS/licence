package fil.coo.dungeon;

import fil.coo.dungeon.character.Monster;
import fil.coo.dungeon.character.Player;
import fil.coo.dungeon.item.GoldPurse;
import fil.coo.dungeon.item.HealthPotion;
import fil.coo.dungeon.item.StrengthPotion;
import fil.coo.dungeon.menu.Menu;
import fil.coo.dungeon.menu.MenuAbout;
import fil.coo.dungeon.rooms.Direction;
import fil.coo.dungeon.rooms.Exit;
import fil.coo.dungeon.rooms.Room;

/**
 *
 * @author seysn
 */
public class AdventureGame {

    public static void main(String[] args) {
        /* Show menu */
        Menu menu = new Menu();

        do {
            menu.show();

            if (menu.getChoice() == 2) {
                new MenuAbout().display();
            }

        } while (menu.getChoice() == 2);

        /* Create rooms */
        Room r1 = new Room("Room 1");
        Room r2 = new Room("Room 2");
        Room r3 = new Room("Room 3");
        Exit r4 = new Exit("Room 4");

        /* Add neighboors */
        r1.addNeighbors(Direction.EAST, r2);
        r2.addNeighbors(Direction.SOUTH, r3);
        r3.addNeighbors(Direction.EAST, r4);

        /* Initializing Rooms contents */
        Player p = new Player("Joe", 10, 100, 0, r1);

        r2.addItems(new HealthPotion(25));
        r2.addItems(new GoldPurse(45));
        r2.addItems(new StrengthPotion(10));

        r3.addMonsters(new Monster("Jack", 30, 20, 12, r3));
        r3.addMonsters(new Monster("Pierre", 25, 35, 192, r3));

        /* Start game */
        System.out.println("\nStarting Dungeon Game");
        while (!p.isDead() && !p.getCurrentRoom().isExit()) {
            System.out.println("\n" + p);
            p.act();
        }

        if (p.isDead()) {
            System.out.println("Game Over");
        } else {
            System.out.println("You win !");
        }
    }
}