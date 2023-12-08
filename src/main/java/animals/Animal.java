package animals;

import food.Food;

public abstract class Animal {
    public void setSatiety(int satiety) {
        if(satiety < 0){
            this.satiety = 0;
        }
        else{ this.satiety = satiety; }

    }
    private String voice;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }



    protected int satiety;
    public abstract void eat(Food food);
    public int getSatiety() {
        return satiety;
    }

}
