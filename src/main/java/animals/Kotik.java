package main.java.animals;

public class Kotik {

    private static final int METHODS = 5;
    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private static int count;
    private String[] schedule = new String[24];

    public static int getMETHODS() {
        return METHODS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Kotik.count = count;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[] schedule) {
        this.schedule = schedule;
    }

    public Kotik(){
        count++;
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }
    
    boolean play(){
        if(satiety > 0){
            System.out.println("Cat is playing! Satiety : " + satiety);
            satiety--;
            System.out.println("Cat stop play. Satiety : " + satiety);
            return true;
        }
        else{
            System.out.println("Cat don't wanna play he's ain't satiety");
            return false;
        }
    }

   boolean sleep(){
       if(satiety > 0){
           System.out.println("Cat is sleep! Satiety : " + satiety);
           satiety--;
           System.out.println("Cat stop sleep. Satiety : " + satiety);
           return true;
       }
       else{
           System.out.println("Cat don't wanna sleep he's ain't satiety");
           return false;
       }
    }

    boolean wash(){
        if(satiety > 0){
            System.out.println("Cat is washin! Satiety : " + satiety);
            satiety--;
            System.out.println("Cat stop wash. Satiety : " + satiety);
            return true;
        }
        else{
            System.out.println("Cat don't wanna wash he's ain't satiety");
            return false;
        }
    }

    boolean walk(){
        if(satiety > 0){
            System.out.println("Cat is walking! Satiety : " + satiety);
            satiety--;
            System.out.println("Cat stop walk. Satiety : " + satiety);
            return true;
        }
        else{
            System.out.println("Cat don't wanna walk he's ain't satiety");
            return false;
        }
    }

    boolean hunt(){
        if(satiety > 0){
            System.out.println("Cat is hunting! Satiety : " + satiety);
            satiety--;
            System.out.println("Cat stop hunt. Satiety : " + satiety);
            return true;
        }
        else{
            System.out.println("Cat don't wanna hunt he's ain't satiety");
            return false;
        }
    }


    public void eat (int food){
        satiety += food;
    }

    public void eat (int food, String foodName){
        satiety += food;
        System.out.println("The cat ate " + foodName);
    }

    public void eat (){
        eat(10 , "Korm");
    }

    public void outputSchedule(String[] mas){
        for (String s : mas){
            System.out.println(s);
        }
    }

    public void liveAnotherDay(){
        for (int i = 0 ; i <24 ; i++){
            switch((int) (Math.random() * METHODS) + 1) {
                case 1:
                    if (play()) {
                        schedule[i] = i + " - Played";
                    } else {
                        schedule[i] = i + " - Ate";
                        eat();
                    }
                    break;
                case 2:
                    if (sleep()) {
                        schedule[i] = i + " - Slept";
                    } else {
                        schedule[i] = i + " - Ate";
                        eat();
                    }
                    break;

                case 3:
                    if (wash()) {
                        schedule[i] = i + " - Washed";
                    } else {
                        schedule[i] = i + " - Ate";
                        eat();
                    }
                    break;
                case 4:
                    if (walk()) {
                        schedule[i] = i + " - Walked";
                    } else {
                        schedule[i] = i + " - Ate";
                        eat();
                    }
                    break;
                case 5:
                    if (hunt()) {
                        schedule[i] = i + " - Hunted";
                    } else {
                        schedule[i] = i + " - Ate";
                        eat();
                    }
                    break;

            }
        }
    }
}
