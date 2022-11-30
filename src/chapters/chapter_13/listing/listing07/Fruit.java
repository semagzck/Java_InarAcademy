package chapters.chapter_13.Listing.Listing_13_07;

public abstract class Fruit implements Edible {

}
class Apple extends Fruit {

    @Override
    public String howToEat() {
        return "Apple: Make apple cider";
    }
}

class Orange extends Fruit {

    @Override
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}
