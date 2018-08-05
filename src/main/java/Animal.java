import java.time.LocalDateTime;

public abstract class Animal {

    protected int weight;
    protected LocalDateTime lastEatTime;

    public Animal() {
        lastEatTime = LocalDateTime.now();
    }


    public boolean isAlive() {

//        if (getLastEatTime().isBefore(LocalDateTime.now().minusDays(10))) {
//            return false;
//        }
//        return true;
        LocalDateTime tenDaysBeforeNow = LocalDateTime.now().minusDays(10);
        return getLastEatTime().isAfter(tenDaysBeforeNow);
    }

    public int getWeight(){
        return weight;
    }

    public void eat() throws CantEatException {
        //ustawiamy datę ostatniego karmienia
        lastEatTime = LocalDateTime.now();
    }

    public void display(){
    }



    public LocalDateTime getLastEatTime() {
        return lastEatTime;
    }
}
