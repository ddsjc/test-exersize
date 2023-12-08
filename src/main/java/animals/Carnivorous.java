package animals;

import food.Food;
import food.Grass;
import food.Meat;

public abstract class Carnivorous extends Animal {

    @Override
    public void eat(Food food) {
        if(food instanceof Meat){
            System.out.println( getType() + " Ate meat");
            setSatiety(food.getEnergy());
        }else{ System.out.println(getType() + " - the predator! Predators does not eat grass"); }
    }
}
