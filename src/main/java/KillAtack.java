public class KillAtack implements AttackStrategy {

    @Override
    public void attack(Animal attacker, Animal defender) {
        System.out.println(attacker.getClass().getSimpleName() + " zabiłem " + defender.getClass().getSimpleName());
    }
}
