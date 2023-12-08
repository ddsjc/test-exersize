package animals;

public class Duck extends Herbivore implements Fly, Swim, Voice, Run {

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

}
