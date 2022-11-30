package chapters.chapter13.listings;

public class Chicken extends Animal implements Edible{
    @Override
    public String howToEat(){
        return "Chicken: fry";
    }
    @Override
    public String sound(){
        return "Chicken: gıt gıt gıdak";
    }
}
