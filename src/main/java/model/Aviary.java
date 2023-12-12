package model;

import animals.Animal;

import java.util.HashMap;

public class Aviary<T extends Animal>{
    private Size size;
    private HashMap<String, T> aviaryMap;

    public Aviary(Size size) {
        this.size = size;
        this.aviaryMap = new HashMap<>();
    }

    public void addAnimal(T animal) {
            if (!animal.getSize().equals(size)) {
                throw new WrongSizeException();
            }
            aviaryMap.put(animal.getName(), animal);
    }
    public T getAnimal(String name){
        for(T animal: aviaryMap.values())
            if (aviaryMap.containsKey(name)){
                return animal;
            }
        return null;
    }

    public boolean removeAnimal(String name){
        if(aviaryMap.containsKey(name)){
            aviaryMap.remove(name);
            return true;
        }
        else{
            return false;
        }
    }
}
