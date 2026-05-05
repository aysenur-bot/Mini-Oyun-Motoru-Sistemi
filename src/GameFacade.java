public class GameFacade {

    private CharacterFactory factory;

    public GameFacade() {
        this.factory = new CharacterFactory();
    }

    public void startGame() {
        System.out.println("Game starting...");

        Character player = factory.createCharacter("PLAYER");
        Character enemy = factory.createCharacter("ENEMY");

        player.update();
        enemy.update();

        System.out.println("Game running...");
    }
}