package animals;

import model.Size;

public class Seal extends Carnivorous implements Swim, Voice, Run {
    public Seal(String name) {
        super(name);
    }

    public void swim(){
        System.out.println("Seal is swimming");
    }

    public void run(){
        System.out.println("Seal is running");
    }

    public String getVoice(){
        return "Brraa";
    }

    public Size getSize() {
        Size size = Size.MEDIUM;
        return size;
    }
}
