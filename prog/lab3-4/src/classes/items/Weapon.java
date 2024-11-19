package classes.items;

import interfaces.Repairable;

import java.util.Random;

public class Weapon extends Item implements Repairable {
    private boolean isWork;
    private Random random = new Random();

    public Weapon(){
        setIsWork();
    }

    public Weapon(double weight) {
        super(weight);
        setIsWork();
    }

    public boolean getIsWork(){
        return this.isWork;
    }

    protected void setIsWork(){
        int randInt = random.nextInt(10);
        if (randInt < 3){
            isWork = false;
        } else {
            isWork = true;
        }
    }

    @Override
    public String toString() {
        return "оружие";
    }

    @Override
    public void repair() {
        System.out.println();
        setIsWork();
        if (getIsWork()){
            System.out.printf("получилось починить %s, можно брать с собой\n", toString());
        } else {
            System.out.printf("не повезло, придётся оставить %s здесь\n", toString());
        }
    }
}

