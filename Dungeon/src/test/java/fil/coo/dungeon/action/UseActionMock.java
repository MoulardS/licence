package fil.coo.dungeon.action;

import fil.coo.dungeon.character.Player;
import fil.coo.dungeon.item.Item;

/**
 *
 * @author boinc
 */
public class UseActionMock extends UseAction {

    @Override
    public void execute(Player p) {
        Item i = p.getCurrentRoom().getItems().get(1);
        i.isUsedBy(p);
        p.getCurrentRoom().removeItem(i);
    }
}
