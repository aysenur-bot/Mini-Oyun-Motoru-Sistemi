public class Character {

    protected String type;
    private AttackStrategy strategy;

    public Character(String type) {
        this.type = type;
    }

    public void setStrategy(AttackStrategy strategy) {
        this.strategy = strategy;
    }

    public void performAttack() {
        strategy.attack();
    }

    public void update() {
        System.out.println(type + " updating...");
    }
}