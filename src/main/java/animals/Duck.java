package animals;

import model.Size;

public class Duck extends Herbivore implements Fly, Swim, Voice, Run {

    public Duck(String name) {
        super(name);
    }

    public void fly(){
        System.out.println("Duck is flying");
    }

    public void swim(){
        System.out.println("Duck is swimming");
    }

    public void run(){
        System.out.println("Duck is running");
    }

    public  String getVoice(){return "Kryaa";}

    public Size getSize() {
        Size size = Size.SMALL;
        return size;
    }

}
