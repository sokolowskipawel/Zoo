public class Bear extends Animal implements Attackable {

    AttackStrategy attackStrategy;
    String name;
    PlayGround playGround;
    Boolean isAlive;

    public Bear(String name, AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
        this.name = name;
        this.isAlive  = true;
    }

    @Override
    public boolean isAlive() {
        if (!isAlive){
            return false;
        }
        return super.isAlive();
    }

    public String getName(){
        return name;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public  void setPlayGround(PlayGround playGround){
        this.playGround = playGround;
    }

    @Override
    public void attack(Animal animal) {
        attackStrategy.attack(this, animal);
    }

    public void attackByName(String defender){
        playGround.attack(this,defender);
    }
}
