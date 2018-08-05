public class PolarBear extends Bear {


    public PolarBear(String name) {
        super(name, new KillAtack());
        this.weight = 200;
    }

    @Override
    public void display() {
        System.out.println("Jestem niedźwiedziem" + getClass().getSimpleName() + "ważę" + getWeight());
     //   System.out.println("I'm polar bear and my weight is:" + weight);
    }

//    @Override
//    public void attack(Animal animal) {
//        attackStrategy.attack(this, animal);
//     //   return "Zabiłem " + animal.getClass().getSimpleName();
//    }

}
