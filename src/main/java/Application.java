import animals.Kotik;

public class Application {
    public static String compareVoice(Kotik voice1, Kotik voice2){
        if (voice1.getVoice().equals(voice2.getVoice())){
            return "Voices is equals";
        }
        else return "Voices is not equals";
    }
    public static void main(String[] args){

        Kotik kotik1 = new Kotik("Barsick", "Myau", 5, 2500);
        Kotik kotik2 = new Kotik();

        kotik2.setName("Vitek");
        kotik2.setVoice("Miy");
        kotik2.setSatiety(7);
        kotik2.setWeight(3200);

        kotik1.liveAnotherDay();
        kotik2.liveAnotherDay();
        kotik1.outputSchedule(kotik1.getSchedule());
        System.out.println("Name is  " + kotik1.getName() + " , weight is " + kotik1.getWeight() + " grams");
        System.out.println("Count of cats : " + Kotik.getCount());

        System.out.println(compareVoice(kotik1, kotik2));

    }
}
