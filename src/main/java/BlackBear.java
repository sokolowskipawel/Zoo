public class BlackBear extends Animal {
    public BlackBear() {
        super();
        this.weight = 50;
    }

    @Override
    public void display() {
        System.out.println("I'm black bear and my weight is:" + weight);
    }
}
