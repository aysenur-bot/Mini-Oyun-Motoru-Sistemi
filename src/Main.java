public class Main {

    public static void main(String[] args) {

        Character c1 = CharacterFactory.createCharacter("PLAYER");
        Character c2 = CharacterFactory.createCharacter("ENEMY");
        Character c3 = CharacterFactory.createCharacter("NPC");

        c1.show();
        c2.show();
        c3.show();
    }
}