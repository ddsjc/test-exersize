package animals;

public class Duck extends Herbivore implements Fly, Swim, Voice {

    public void fly(){
        System.out.println("Duck is flying");
    }

    public void swim(){
        System.out.println("Duck is swimming");
    }

}
