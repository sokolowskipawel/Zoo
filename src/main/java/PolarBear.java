public class PolarBear extends Bear {
    private AttackStrategy attackStrategy;

    public PolarBear() {
        super();
        this.weight = 200;
        attackStrategy = new KillAtack();
    }

    @Override
    public void display() {
        System.out.println("Jestem niedźwiedziem" + getClass().getSimpleName() + "ważę" + getWeight());
     //   System.out.println("I'm polar bear and my weight is:" + weight);
    }

    @Override
    public void attack(Animal animal) {
        attackStrategy.attack(this, animal);
     //   return "Zabiłem " + animal.getClass().getSimpleName();
    }
}
