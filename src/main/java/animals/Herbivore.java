package main.java.animals;

import main.java.animals.Animal;
import main.java.food.Food;
import main.java.food.Meat;

public class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if(food instanceof Meat){
            System.out.println("Покушал мяско");
        }else{ System.out.println("Хищник не кущает мясо"); }
    }
}
