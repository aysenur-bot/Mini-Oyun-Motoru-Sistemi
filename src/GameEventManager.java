import java.util.ArrayList;
import java.util.List;

public class GameEventManager {

    private List<GameObserver> observers = new ArrayList<>();

    public void addObserver(GameObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String event) {
        for (GameObserver observer : observers) {
            observer.onEvent(event);
        }
    }
}