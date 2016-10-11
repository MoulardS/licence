package test.java.fil.coo.dungeon.action;

//import fil.coo.dungeon.character.Monster;
//import fil.coo.dungeon.character.Player;
import main.action.Attack;
import main.personnage.Monster;
import main.personnage.Player;

/**
 *
 * @author moulard
 */
public class AttackMock extends Attack {

    @Override
    public void execute(Player p) {
        Monster m = p.getCurrentRoom().getMonsters().get(1);
        p.attack(m);

        if (m.isDead()) {
            m.die();
        } else {
            m.attack(p);
        }

        if (p.isDead()) {
            p.die();
        }

    }
}
