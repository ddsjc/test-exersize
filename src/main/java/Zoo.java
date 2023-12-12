import animals.*;
import employee.Worker;
import food.Food;
import food.Grass;
import food.Meat;
import model.Aviary;
import model.Size;

public class Zoo {
    private static Aviary<Herbivore> herbivoreAviary = new Aviary<>(Size.LARGE);;
    private static Aviary<Carnivorous> carnivorousAviary = new Aviary<>(Size.MEDIUM);;
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


        Zoo zoo = new Zoo();

        zoo.fillCarnivorousAviary();
        zoo.fillHerbivoreAviary();
        getCarnivorous("Freddy");
        getHerbivore("Vasiliy");
    }

    static void fillCarnivorousAviary(){
        Mole mole = new Mole("Freddy");
        Wolf wolf2 = new Wolf("Pirog");
        Kotik kotik2 = new Kotik("Marik");
        carnivorousAviary.addAnimal(mole);
        carnivorousAviary.addAnimal(wolf2);
        carnivorousAviary.addAnimal(kotik2);
    }

    static void fillHerbivoreAviary(){
        Giraffe giraffe = new Giraffe("Vasiliy");
        Duck duck2 = new Duck("Trump");
        Fish fish2 = new Fish("Piran");
        herbivoreAviary.addAnimal(giraffe);
        herbivoreAviary.addAnimal(duck2);
        herbivoreAviary.addAnimal(fish2);
    }

    static Carnivorous getCarnivorous(String name){
        return carnivorousAviary.getAnimal(name);
    }

    static Herbivore getHerbivore(String name){
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
