package animals;

public class Wolf extends Carnivorous implements Run, Voice {
    public void run(){
        System.out.println("Wolf is running");
    }

    public String getVoice(){
        return "Avuuu!";
    }
}
