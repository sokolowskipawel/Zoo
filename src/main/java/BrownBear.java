public class BrownBear extends Bear {

    private AttackStrategy attackStrategy;

    public BrownBear() {
        super();
        this.weight = 100;
        attackStrategy = new InjuryAtack();
    }

    @Override
    public void display() {
        System.out.println("I'm brown bear and my weight is:" + weight);
    }

    @Override
    public void attack(Animal animal) {
        attackStrategy.attack(this,animal);
    }
}
