import animals.*;
import employee.Worker;
import food.Food;
import food.Grass;
import food.Meat;
import model.Aviary;
import model.Size;

public class Zoo {
    private static Aviary<Animal> herbivoreAviary;
    private static Aviary<Animal> carnivorousAviary;
    public static void main(String[] args){
        Duck duck1 = new Duck("Donald");
        duck1.setVoice("Krya");
        duck1.setSatiety(0);

        Wolf wolf1 = new Wolf("AUF");
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


        Swim[] pound = createPond();

        for(Swim swim : pound){
            swim.swim();
        }
        herbivoreAviary = new Aviary<>(Size.LARGE);
        carnivorousAviary = new Aviary<>(Size.MEDIUM);
        fillCarnivorousAviary(carnivorousAviary);
        fillHerbivoreAviary(herbivoreAviary);
        getCarnivorous("Freddy");
        getHerbivore("Vasiliy");
    }
    static void fillCarnivorousAviary(Aviary<Animal> carnivorousAviary){
        Mole mole = new Mole("Freddy");
        Fish fish2 = new Fish("Pirog");
        carnivorousAviary.addAnimal(mole);
        carnivorousAviary.addAnimal(fish2);
    }

    static void fillHerbivoreAviary(Aviary<Animal> herbivoreAviary){
        Giraffe giraffe = new Giraffe("Vasiliy");
        Duck duck2 = new Duck("Trump");
        herbivoreAviary.addAnimal(giraffe);
        herbivoreAviary.addAnimal(duck2);
    }

    static Animal getCarnivorous(String name){
        return carnivorousAviary.getAnimal(name);
    }

    static Animal getHerbivore(String name){
        return herbivoreAviary.getAnimal(name);
    }
    public static Swim[] createPond(){
        Swim[] pound = new Swim[3];
        pound[0] = new Duck("Kryalduck");
        pound[1] = new Fish("Machine");
        pound[2] = new Seal("Ponoseal");
        return  pound;
    }
}
