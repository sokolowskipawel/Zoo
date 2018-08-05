public class InjuryAtack implements AttackStrategy {
    @Override
    public void attack(Animal attacker, Animal defender) {
        System.out.println(attacker.getClass().getSimpleName() + " zraniłem " + defender.getClass().getSimpleName());
    }
}
