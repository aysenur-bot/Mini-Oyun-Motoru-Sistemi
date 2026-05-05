public class EnemyAdapter extends Character {

    private ExternalEnemySystem externalSystem;

    public EnemyAdapter() {
        super("Enemy");
        this.externalSystem = new ExternalEnemySystem();
    }

    @Override
    public void update() {
        externalSystem.spawnEnemyAI();
    }
}