package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;

public abstract class Carnivorous extends Animal {


    public Carnivorous(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) throws WrongFoodException{
        try {
            if (food instanceof Meat) {
                System.out.println(getName() + " Ate meat");
                setSatiety(food.getEnergy());
            }
            else{throw new WrongFoodException();}
        }catch(WrongFoodException e){
                e.printStackTrace();
                throw e;
            }

        }
}
