public class CharacterFactory {

    public static Character createCharacter(String type) {

        if(type.equals("PLAYER")) {
            return new Character("PLAYER", 100);
        }

        else if(type.equals("ENEMY")) {
            return new Character("ENEMY", 80);
        }

        else if(type.equals("NPC")) {
            return new Character("NPC", 50);
        }

        return null;
    }
}