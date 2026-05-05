public class Character {
    String type;
    int hp;

    public Character(String type, int hp) {
        this.type = type;
        this.hp = hp;
    }

    public void show() {
        System.out.println(type + " HP: " + hp);
    }
}