public class BlackBear extends Bear {

    private AttackStrategy attackStrategy;

    public BlackBear() {
        super();
        this.weight = 50;
        attackStrategy = new InjuryAtack();
    }

    @Override
    public void display() {
        System.out.println("I'm black bear and my weight is:" + weight);
    }

    @Override
    public void attack(Animal animal) {
        attackStrategy.attack(this, animal);
    }
}
