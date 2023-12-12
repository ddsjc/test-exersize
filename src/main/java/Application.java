import animals.Kotik;

public class Application {
    public static void main(String[] args){

        Kotik kotik1 = new Kotik("Barsick");
        Kotik kotik2 = new Kotik("Dasha");

        kotik2.setName("Vitek");
        kotik2.setVoice("Miy");
        kotik2.setSatiety(7);
        kotik2.setWeight(3200);

        kotik1.liveAnotherDay();
        kotik1.outputSchedule(kotik1.getSchedule());
        System.out.println("Name is  " + kotik1.getName() + " , weight is " + kotik1.getWeight() + " grams");
        System.out.println("Count of cats : " + Kotik.getCount());
        if(kotik1.getVoice().equals(kotik2.getVoice())){
            System.out.println("Voices is equals!");
        }
        else{
            System.out.println("Not equals voices!");
        }
    }
}
