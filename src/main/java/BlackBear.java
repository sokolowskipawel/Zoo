public class BlackBear extends Bear {

    public BlackBear(String name) {
        super(name, new InjuryAtack());
        this.weight = 50;
    }

    @Override
    public void display() {
        System.out.println("I'm black bear and my weight is:" + weight);
    }

//    @Override
//    public void attack(Animal animal) {
//        attackStrategy.attack(this, animal);
//    }
}
