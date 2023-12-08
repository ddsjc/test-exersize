package animals;

public class Giraffe extends Herbivore implements Run, Voice {
    public void run(){
        System.out.println("Giraffe is running");
    }
    public String getVoice(){
        return "Drin";
    }
}
