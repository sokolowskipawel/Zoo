public class AnimalTest {
    public static void main(String[] args) {
        PolarBear polarBear = new PolarBear();
        Animal brownBear = new BrownBear();

        System.out.println(((PolarBear) polarBear).attack(brownBear));
    }
}
