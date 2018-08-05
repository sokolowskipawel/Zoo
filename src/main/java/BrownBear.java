public class BrownBear extends Animal {
    public BrownBear() {
        super();
        this.weight = 100;
    }

    @Override
    public void display() {
        System.out.println("I'm brown bear and my weight is:" + weight);
    }
}
