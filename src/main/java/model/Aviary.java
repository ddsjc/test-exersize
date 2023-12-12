package model;

import animals.Animal;

import java.util.HashMap;

public class Aviary<T extends Animal>{
    public Size size;
    private HashMap<String, T> animals;

    public Aviary(Size size) {
        this.size = size;
        this.animals = new HashMap<>();
    }

    public void addAnimal(T animal) {
        try {
            if(animal.getSize().equals(size)) {
                animals.put(animal.getName(), animal);
            }
        }catch (WrongSizeException e){
            System.out.println(">>>" + e);
        }

    }
    public T getAnimal(String name){
        for(T animal: animals.values())
            if (animals.containsKey(name)){
                return animal;
            }
        return null;
    }

    public boolean removeAnimal(T animal){
        if(animals.containsKey(animal.getName())){
            animals.remove(animal.getName());
            return true;
        }
        else{
            return false;
        }
    }
}
