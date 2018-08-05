public class TeddyBear extends Animal {
    @Override
    public void eat() throws CantEatException {
        throw new CantEatException();
      //  return;
    }

    @Override
    public void display() {
        System.out.println("I'm Teddy bear.");
    }
}
