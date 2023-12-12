package employee;

import animals.Animal;
import animals.Voice;
import food.Food;

public class Worker {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Animal animal, Food food){
        try{
            animal.eat(food);
            System.out.println(getName() + " fed " + animal.getName());
            System.out.println("Animal ate satiety is " + animal.getSatiety());
        }catch (Exception e){
            System.out.println("Mistake of feed!");
        }
    }

    public void getVoice(Voice animal){
        System.out.println("- " + getName() + " : 'Voice !'");
        System.out.println("*Voice is* " + animal.getVoice());
    }
}
