package animals;

import model.Size;

public class Fish extends Herbivore implements Swim {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Fish is swim");
    }

    public Size getSize() {
        Size size = Size.MEDIUM;
        return size;
    }
}
