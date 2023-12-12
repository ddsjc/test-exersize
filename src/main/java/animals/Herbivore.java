package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;

public abstract class Herbivore extends Animal {

    public Herbivore(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException {
        try{
            if(food instanceof Grass) {
                System.out.println(getName() + " Ate grass!");
                setSatiety(food.getEnergy());
            }
            else{ throw new WrongFoodException();}
        }catch (WrongFoodException e){
            e.printStackTrace();
            throw e;
        }

    }
}
