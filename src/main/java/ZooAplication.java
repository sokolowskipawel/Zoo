public class ZooAplication {
    public static void main(String[] args) {
        Bear polarBear = new PolarBear();
        Bear brownBear = new BrownBear();
        Bear blackBear = new BlackBear();

        polarBear.attack(brownBear);
        blackBear.attack(polarBear);
        brownBear.attack(blackBear);
    }
}
