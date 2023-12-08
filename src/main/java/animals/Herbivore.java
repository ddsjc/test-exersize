package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Herbivore extends Animal {

    @Override
    public void eat(Food food) {
        if(food instanceof Grass){
            System.out.println(getType() + " Ate grass!");
            setSatiety(food.getEnergy());
        } else{ System.out.println(getType() + " - is herbivore. Herbivores cannot eat meat"); }
    }
}
