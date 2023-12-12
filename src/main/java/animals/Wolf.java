package animals;

import model.Size;

public class Wolf extends Carnivorous implements Run, Voice {
    public Wolf(String name) {
        super(name);
    }

    public void run(){
        System.out.println("Wolf is running");
    }

    public String getVoice(){
        return "Avuuu!";
    }

    public Size getSize() {
        Size size = Size.MEDIUM;
        return size;
    }
}
