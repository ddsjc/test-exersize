package animals;

import food.Food;
import food.WrongFoodException;
import model.Size;

public abstract class Animal {
    public void setSatiety(int satiety) {
        if(satiety < 0){
            this.satiety = 0;
        }
        else{ this.satiety = satiety; }

    }
    private String voice;
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }



    protected int satiety;
    public abstract void eat(Food food) throws WrongFoodException;
    public int getSatiety() {
        return satiety;
    }

    public abstract Size getSize();

}
