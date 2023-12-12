package animals;

import model.Size;

public class Mole extends Carnivorous implements Run {
    public Mole(String name) {
        super(name);
    }

    public void run(){
        System.out.println("Mole is running");
    }

    public Size getSize() {
        Size size = Size.SMALL;
        return size;
    }
}
