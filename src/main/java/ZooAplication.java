public class ZooAplication {
    public static void main(String[] args) {
        PlayGround playGround = new PlayGround();

        Bear polarBear = new PolarBear("Polarny");
        Bear brownBear = new BrownBear("Brązowy");
        Bear blackBear = new BlackBear("Czarny");
        Bear polarny2 = new PolarBear("Polarny2");

//        polarBear.attack(brownBear);
//        blackBear.attack(polarBear);
//        brownBear.attack(blackBear);

        playGround.register(polarBear);
        playGround.register(brownBear);
        playGround.register(blackBear);
        //       playGround.register(polarny2);

        polarBear.attackByName("Polarny");
        brownBear.attackByName("Czarny");
        blackBear.attackByName("Polarny2");
    }
}
