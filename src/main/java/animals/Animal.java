package main.java.animals;

import main.java.food.Food;

public abstract class Animal {
    public int satiety;

    public abstract void eat(Food food);
    public int getSatiety() {
        return satiety;
    }

}
