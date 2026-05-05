public class Character {

    protected String type;

    public Character(String type) {
        this.type = type;
    }

    public void update() {
        System.out.println(type + " is updating...");
    }
}