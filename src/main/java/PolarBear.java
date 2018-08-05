import java.time.LocalDateTime;

public class PolarBear extends Animal implements Attackaible  {

    public PolarBear() {
        super();
        this.weight = 200;
    }

    @Override
    public void display() {
        System.out.println("Jestem niedźwiedziem" + getClass().getSimpleName() + "ważę" + getWeight());
     //   System.out.println("I'm polar bear and my weight is:" + weight);
    }

    @Override
    public String attack(Animal animal) {
        return "Zabiłem " + animal.getClass().getSimpleName();
    }
}
