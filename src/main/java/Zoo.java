import animals.*;
import employee.Worker;
import food.Food;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args){
        Duck duck1 = new Duck();
        duck1.setType("Duck1");
        duck1.setVoice("Krya");
        duck1.setSatiety(0);

        Wolf wolf1 = new Wolf();
        wolf1.setType("Wolf1");
        wolf1.setVoice("Avyyy");
        wolf1.setSatiety(0);

        Food grass = new Grass();
        Food meat = new Meat();
        grass.getEnergy();
        meat.getEnergy();
        Worker worker = new Worker();
        worker.setName("Vasya");
        worker.feed(duck1, grass);
        worker.feed(duck1, meat);
        worker.getVoice(duck1);

        worker.feed(wolf1, meat);
        worker.getVoice(wolf1);

        Swim[] pound = createPound();

        for(Swim swim : pound){
            swim.swim();
        }
    }

    public static Swim[] createPound(){
        Swim[] pound = new Swim[3];
        pound[0] = new Duck();
        pound[1] = new Fish();
        pound[2] = new Seal();
        return  pound;
    }
}
