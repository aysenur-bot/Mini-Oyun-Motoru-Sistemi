public class Main {

    public static void main(String[] args) {

        Character player = new Character("Player");

        player.setStrategy(new SwordAttack());
        player.performAttack();

        player.setStrategy(new MagicAttack());
        player.performAttack();

        GameEventManager manager = new GameEventManager();
        manager.addObserver(new ConsoleObserver());

        manager.notifyObservers("Player attacked");
    }
}