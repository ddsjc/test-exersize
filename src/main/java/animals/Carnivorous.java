package main.java.animals;

import main.java.animals.Animal;
import main.java.food.Food;
import main.java.food.Grass;

public class Carnivorous extends Animal {
    @Override
    public void eat(Food food) {
        if(food instanceof Grass){
            System.out.println("Покушал травку!");
        } else{ System.out.println("Травоядные не могут кушать мяско"); }
    }
}
