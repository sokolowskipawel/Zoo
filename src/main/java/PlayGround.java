import java.util.HashMap;
import java.util.Map;

public class PlayGround {

    private Map<String, Bear> players = new HashMap<>();

    public void register(Bear bear) {
        bear.setPlayGround(this);
        players.put(bear.getName(), bear);
    }

    public void attack(Bear attacer, String defender) {
        try {
            Bear bear = players.get(defender);
            attacer.attack(bear);
        } catch (NullPointerException exception) {
            System.out.println("Nie ma takiego misia !!!");
        }
    }

}
