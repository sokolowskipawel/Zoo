public class BrownBear extends Bear {

    public BrownBear(String name) {
        super(name, new InjuryAtack());
        this.weight = 100;
    }

    @Override
    public void display() {
        System.out.println("I'm brown bear and my weight is:" + weight);
    }

//    @Override
//    public void attack(Animal animal) {
//        attackStrategy.attack(this,animal);
//    }
}
