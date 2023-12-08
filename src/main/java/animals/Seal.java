package animals;

public class Seal extends Carnivorous implements Swim, Voice, Run {
    public void swim(){
        System.out.println("Seal is swimming");
    }

    public void run(){
        System.out.println("Seal is running");
    }
}
