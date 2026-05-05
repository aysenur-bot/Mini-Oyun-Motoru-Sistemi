public class CharacterFactory {

    public Character createCharacter(String type) {

        if (type.equals("PLAYER")) {
            return new Character("Player");
        }

        if (type.equals("ENEMY")) {
            return new EnemyAdapter(); // Adapter burada kullanılıyor
        }

        return null;
    }
}