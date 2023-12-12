package animals;

import model.Size;

public class Giraffe extends Herbivore implements Run, Voice {
    public Giraffe(String name) {
        super(name);
    }

    public void run(){
        System.out.println("Giraffe is running");
    }
    public String getVoice(){
        return "Drin";
    }

    public Size getSize() {
        Size size = Size.LARGE;
        return size;
    }
}
