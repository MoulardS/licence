package test.java.fil.coo.dungeon.action;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author boinc
 */
public class ActionAttackTest extends ActionTest {

    @Before
    @Override
    public void setUp() {
        super.setUp();
        super.a = new ActionAttack();
    }

    @After
    public void tearDown() {
        super.p.setHealth(100);
    }

    /**
     * Test of execute method, of class ActionAttack.
     */
    @Test
    @Override
    public void testExecute() {
        System.out.println("execute");
        new ActionAttackMock().execute(super.p);
        assertEquals(super.r.getMonsters().size(), 1);
    }

    @Override
    public void testToString() {
        System.out.println("toString");
        String except = "Attack";
        String result = super.a.toString();
        assertEquals(except, result);
    }

}
