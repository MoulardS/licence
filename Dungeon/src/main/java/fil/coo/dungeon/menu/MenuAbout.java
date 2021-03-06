package fil.coo.dungeon.menu;

/**
 *
 * @author boinc
 */
public class MenuAbout {

    String[] about = {
        "",
        "Dungeon",
        "By Nicolas SEYS and Clément BOIN",
        "Made Sep 2016",
        "For Java Programming courses.",
        "",
        "This game is under GNU GPL version 3."
    };

    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (String s : this.about) {
            result.append(s).append("\n");
        }

        return result.toString();
    }

}
