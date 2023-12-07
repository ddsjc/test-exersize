package main.java.food;

public abstract class Food {

    public void energy() {
        int i = (int) (Math.random()*2);
        if (i == 0) {
            Food food = new Grass();
        } else {
            Food food = new Meat();
        }
    }
    public abstract int getEnergy();
}
